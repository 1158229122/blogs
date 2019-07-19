package com.gtcmaile.blogs.web.dao.base;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;

import java.util.*;

import com.gtcmaile.blogs.annotation.IsID;
import com.gtcmaile.blogs.pojo.common.PageData;

import com.gtcmaile.blogs.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * @Author: jim
 * @Date: 2019/7/19 7:32
 * 容许实例化,必须作用与超类,实例化方法中添加了对子类的类型扫描
 * 单独实例化无法使用
 * @Version 1.0
 */
public abstract class BaseDaoImpl<T>{
    /** 设置一些操作的常量 */
    public static final String SQL_INSERT = "insert";
    public static final String SQL_UPDATE = "update";
    public static final String SQL_DELETE = "delete";
    public static final String SQL_SELECT = "select";


    @Autowired
    private JdbcTemplate jdbcTemplate;


    private Class<T> entityClass;

    @SuppressWarnings("unchecked")
    public BaseDaoImpl() {
        ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
        entityClass = (Class<T>) type.getActualTypeArguments()[0];
        System.out.println("Dao实现类是：" + entityClass.getName());
    }

    public Integer save(T entity){
        Map<String, Object> map = this.fieldSql(entity, this.SQL_INSERT);
        String filed = (String) map.get("filed");
        List filedValue = (List) map.get("filedValue");
        if (entity!=null &&!StringUtils.isEmpty(filed)){
            StringBuffer sb = new StringBuffer();
            sb.append("INSERT INTO ")
            .append(entityClass.getSimpleName())
            .append(filed);
            jdbcTemplate.update(sb.toString(),filedValue.toArray());
        }
        return 0;
    }

    public Integer update(T entity){
        Map<String, Object> map = this.fieldSql(entity, this.SQL_UPDATE);
        String filed = (String) map.get("filed");
        List filedValue = (List) map.get("filedValue");
        Field[] declaredFields = entity.getClass().getDeclaredFields();
        String idName = null;
        Object idValue = null;
        for (Field declaredField : declaredFields) {
            if (declaredField.isAnnotationPresent(IsID.class)){
                idName =declaredField.getName();
                try {
                    declaredField.setAccessible(true);
                    idValue=declaredField.get(entity);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        filedValue.add(idValue);
        if (entity!=null &&!StringUtils.isEmpty(filed)){
            StringBuffer sb = new StringBuffer();
            sb.append("UPDATE ")
                    .append(entityClass.getSimpleName())
                    .append("  SET  ")
                    .append(filed)
                    .append("  WHERE  ");
            if (StringUtils.isEmpty(idName)){
                //默认为id
                sb.append("  id  =  ?");
            }else {
                sb.append(idName)
                        .append("  =  ?");
            }
            jdbcTemplate.update(sb.toString(),filedValue.toArray());
        }
        return 0;
    }




    public Integer deleteById(Serializable id) {
        String sql =StringUtils.concat(" DELETE FROM ", entityClass.getSimpleName()," WHERE id=?") ;
        int update = jdbcTemplate.update(sql, id);
        return update;
    }

    public void deleteAll() {
        String sql = StringUtils.concat(" TRUNCATE TABLE ", entityClass.getSimpleName()) ;
        jdbcTemplate.execute(sql);
    }

    public T findById(Serializable id) {
        String sql = StringUtils.concat("SELECT * FROM ", entityClass.getSimpleName(), " WHERE id=?");
        RowMapper<T> rowMapper = BeanPropertyRowMapper.newInstance(entityClass);
        return jdbcTemplate.query(sql, rowMapper, id).get(0);
    }

    public List<T> findAll() {
        String sql = StringUtils.concat("SELECT * FROM " , entityClass.getSimpleName());
        RowMapper<T> rowMapper = BeanPropertyRowMapper.newInstance(entityClass);
        return jdbcTemplate.query(sql, rowMapper);
    }


    /**
     *
     * @param
     * @return
     */

    public int count(T entity) {
        StringBuffer sql = new StringBuffer(" SELECT COUNT(*) FROM  ");
        sql.append(entityClass.getSimpleName());

        Map<String, Object> map = this.fieldSql(entity, this.SQL_SELECT);
        String filedSql = (String) map.get("filed");
        List filedValue = (List) map.get("filedValue");
        if (entity != null&&!StringUtils.isEmpty(filedSql)) {
            sql.append(" WHERE ");
            sql.append(filedSql);
        }
        System.out.println("SQL=" + sql);
        return jdbcTemplate.queryForObject(sql.toString(),filedValue.toArray(),Integer.class);
    }

    /**
     * 单表条件查询封装
     *
     * @param pageNum
     * @param pageSize
     * @param entity
     * @param order
     * @return
     */
    public PageData<T> findByConditionAndPage(Integer pageNum,Integer pageSize,T entity,Map<String,String> order){
        Map<String, Object> map = this.fieldSql(entity, this.SQL_SELECT);
        String filedSql = (String) map.get("filed");
        List filedValue = (List) map.get("filedValue");
        StringBuffer sb = getConditionSearchSql(entity, order,filedSql);
        if (pageNum!=null&&pageSize!=null){
            //分页不等于空,数字不担心sql注入,直接拼接,controller层配置参数合理化
            sb.append("LIMIT ");
            sb.append((pageNum-1)*pageSize);
            sb.append(",");
            sb.append(pageSize);
        }
        System.out.println("SQL=" + sb.toString());
        List<T> userList = jdbcTemplate.query(sb.toString(), filedValue.toArray(), new BeanPropertyRowMapper<>(entityClass));
        PageData pageData = new PageData();
        pageData.setList(userList);
        pageData.setTotal(this.count(entity));
        return pageData;
    }

    /**
     * 条件查询
     * @param entity
     * @param order
     * @return
     */
    public List<T> findByCondition(T entity, Map<String, String> order){
        Map<String, Object> map = this.fieldSql(entity, this.SQL_SELECT);
        String filedSql = (String) map.get("filed");
        List filedValue = (List) map.get("filedValue");
        StringBuffer conditionSearchSql = this.getConditionSearchSql(entity, order,filedSql);
        System.out.println("SQL=" + conditionSearchSql.toString());
        return jdbcTemplate.query(conditionSearchSql.toString(), filedValue.toArray(), new BeanPropertyRowMapper<>(entityClass));
    }

    private StringBuffer getConditionSearchSql(T entity, Map<String, String> order,String fieldSql) {

            StringBuffer sb = new StringBuffer("SELECT * FROM ");
            sb.append(entityClass.getSimpleName());
            sb.append("  ");


            if (entity!=null&&!StringUtils.isEmpty(fieldSql)){
                //拼接条件
                sb.append("WHERE ");
                sb.append(fieldSql);
            }
            if (order!=null&&order.size()>0){
                sb.append(" ORDER BY ");
                for (Map.Entry<String, String> entry : order.entrySet()) {
                    sb.append(entry.getKey());
                    sb.append(" ");
                    sb.append(entry.getValue());
                    sb.append(" , ");
                }
                sb.deleteCharAt(sb.lastIndexOf(","));
            }
            return sb;


    }

    /**
     *
     * @param entity 实体类
     * @param str 条件是查询传 = 增 修传 ,
     * @return 实体类存在值的话将其字段值给取出来
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    private Map<String,Object> fieldSql(T entity,String str){
        try {
            Map<String,Object> map = new HashMap();
            List list = new LinkedList();
            StringBuffer sb = new StringBuffer();
            StringBuffer insert = new StringBuffer();;
            if(SQL_INSERT.equals(str)){
                //是添加
                sb.append("( ");
                insert.append(" VALUES ( ");
            }

            if (entity!=null){
                Field[] fields = entity.getClass().getDeclaredFields();
                for (int i = 0; fields != null && i < fields.length; i++) {
                    fields[i].setAccessible(true);
                    Object o = fields[i].get(entity);
                    if (o!=null){
                        list.add(o);
                        if (SQL_SELECT.equals(str)){
                            sb.append(fields[i].getName());
                            sb.append(" = ");
                            sb.append("? ");
                            sb.append(" AND ");
                        }else if(SQL_INSERT.equals(str)){
                            insert.append(" ?  ,");
                            sb.append(fields[i].getName())
                                    .append(" , ");
                        }else if(SQL_UPDATE.equals(str)){
                            sb.append(fields[i].getName())
                                    .append("  =  ?   ,    ");
                        }


                    }
                }
                //去掉最后一个AND
                map.put("filedValue",list);
                map.put("filed",sb.toString());
                if (SQL_SELECT.equals(str)){
                    int endIndex = sb.lastIndexOf("AND");
                    if (endIndex > 0) {
                        //有的话去掉直接返回
                        map.put("filed",sb.substring(0, endIndex));
                        return  map;
                    }
                }else if(SQL_INSERT.equals(str)){
                    //去掉最后一个逗号
                    int i = insert.lastIndexOf(",");
                    String insSub = "";
                    String sbSub = "";
                    if (i > 0) {
                        //有的话去掉直接返回
                         insSub = insert.substring(0, i);
                    }
                    int i1 = sb.lastIndexOf(",");
                    if (i1 > 0) {
                        //有的话去掉直接返回
                         sbSub = sb.substring(0, i1);
                    }
                    map.put("filed",StringUtils.concat(sbSub," ) ",insSub, " )"));
                    return  map;
                }else if (SQL_UPDATE.equals(str)){
                    //去掉最后一个,
                    int endIndex = sb.lastIndexOf(",");
                    if (endIndex > 0) {
                        //有的话去掉直接返回
                        map.put("filed",sb.substring(0, endIndex));
                        return  map;
                    }
                }
            }

            return map;
        }catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        //异常处理
        return null;
    }


}