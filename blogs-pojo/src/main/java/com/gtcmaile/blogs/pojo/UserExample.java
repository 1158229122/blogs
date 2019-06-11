package com.gtcmaile.blogs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickName is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickName is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickName =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickName <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickName >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickName >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickName <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickName <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickName like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickName not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickName in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickName not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickName between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickName not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andHeadurlIsNull() {
            addCriterion("headUrl is null");
            return (Criteria) this;
        }

        public Criteria andHeadurlIsNotNull() {
            addCriterion("headUrl is not null");
            return (Criteria) this;
        }

        public Criteria andHeadurlEqualTo(String value) {
            addCriterion("headUrl =", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlNotEqualTo(String value) {
            addCriterion("headUrl <>", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlGreaterThan(String value) {
            addCriterion("headUrl >", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlGreaterThanOrEqualTo(String value) {
            addCriterion("headUrl >=", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlLessThan(String value) {
            addCriterion("headUrl <", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlLessThanOrEqualTo(String value) {
            addCriterion("headUrl <=", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlLike(String value) {
            addCriterion("headUrl like", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlNotLike(String value) {
            addCriterion("headUrl not like", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlIn(List<String> values) {
            addCriterion("headUrl in", values, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlNotIn(List<String> values) {
            addCriterion("headUrl not in", values, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlBetween(String value1, String value2) {
            addCriterion("headUrl between", value1, value2, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlNotBetween(String value1, String value2) {
            addCriterion("headUrl not between", value1, value2, "headurl");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andExpscoreIsNull() {
            addCriterion("expScore is null");
            return (Criteria) this;
        }

        public Criteria andExpscoreIsNotNull() {
            addCriterion("expScore is not null");
            return (Criteria) this;
        }

        public Criteria andExpscoreEqualTo(Integer value) {
            addCriterion("expScore =", value, "expscore");
            return (Criteria) this;
        }

        public Criteria andExpscoreNotEqualTo(Integer value) {
            addCriterion("expScore <>", value, "expscore");
            return (Criteria) this;
        }

        public Criteria andExpscoreGreaterThan(Integer value) {
            addCriterion("expScore >", value, "expscore");
            return (Criteria) this;
        }

        public Criteria andExpscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("expScore >=", value, "expscore");
            return (Criteria) this;
        }

        public Criteria andExpscoreLessThan(Integer value) {
            addCriterion("expScore <", value, "expscore");
            return (Criteria) this;
        }

        public Criteria andExpscoreLessThanOrEqualTo(Integer value) {
            addCriterion("expScore <=", value, "expscore");
            return (Criteria) this;
        }

        public Criteria andExpscoreIn(List<Integer> values) {
            addCriterion("expScore in", values, "expscore");
            return (Criteria) this;
        }

        public Criteria andExpscoreNotIn(List<Integer> values) {
            addCriterion("expScore not in", values, "expscore");
            return (Criteria) this;
        }

        public Criteria andExpscoreBetween(Integer value1, Integer value2) {
            addCriterion("expScore between", value1, value2, "expscore");
            return (Criteria) this;
        }

        public Criteria andExpscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("expScore not between", value1, value2, "expscore");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNull() {
            addCriterion("registerTime is null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNotNull() {
            addCriterion("registerTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeEqualTo(Date value) {
            addCriterion("registerTime =", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotEqualTo(Date value) {
            addCriterion("registerTime <>", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThan(Date value) {
            addCriterion("registerTime >", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registerTime >=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThan(Date value) {
            addCriterion("registerTime <", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThanOrEqualTo(Date value) {
            addCriterion("registerTime <=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIn(List<Date> values) {
            addCriterion("registerTime in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotIn(List<Date> values) {
            addCriterion("registerTime not in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeBetween(Date value1, Date value2) {
            addCriterion("registerTime between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotBetween(Date value1, Date value2) {
            addCriterion("registerTime not between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andWeiboIsNull() {
            addCriterion("weiBo is null");
            return (Criteria) this;
        }

        public Criteria andWeiboIsNotNull() {
            addCriterion("weiBo is not null");
            return (Criteria) this;
        }

        public Criteria andWeiboEqualTo(String value) {
            addCriterion("weiBo =", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboNotEqualTo(String value) {
            addCriterion("weiBo <>", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboGreaterThan(String value) {
            addCriterion("weiBo >", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboGreaterThanOrEqualTo(String value) {
            addCriterion("weiBo >=", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboLessThan(String value) {
            addCriterion("weiBo <", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboLessThanOrEqualTo(String value) {
            addCriterion("weiBo <=", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboLike(String value) {
            addCriterion("weiBo like", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboNotLike(String value) {
            addCriterion("weiBo not like", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboIn(List<String> values) {
            addCriterion("weiBo in", values, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboNotIn(List<String> values) {
            addCriterion("weiBo not in", values, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboBetween(String value1, String value2) {
            addCriterion("weiBo between", value1, value2, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboNotBetween(String value1, String value2) {
            addCriterion("weiBo not between", value1, value2, "weibo");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("weChat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("weChat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("weChat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("weChat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("weChat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("weChat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("weChat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("weChat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("weChat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("weChat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("weChat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("weChat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("weChat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("weChat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andMiniprogramIsNull() {
            addCriterion("miniProgram is null");
            return (Criteria) this;
        }

        public Criteria andMiniprogramIsNotNull() {
            addCriterion("miniProgram is not null");
            return (Criteria) this;
        }

        public Criteria andMiniprogramEqualTo(String value) {
            addCriterion("miniProgram =", value, "miniprogram");
            return (Criteria) this;
        }

        public Criteria andMiniprogramNotEqualTo(String value) {
            addCriterion("miniProgram <>", value, "miniprogram");
            return (Criteria) this;
        }

        public Criteria andMiniprogramGreaterThan(String value) {
            addCriterion("miniProgram >", value, "miniprogram");
            return (Criteria) this;
        }

        public Criteria andMiniprogramGreaterThanOrEqualTo(String value) {
            addCriterion("miniProgram >=", value, "miniprogram");
            return (Criteria) this;
        }

        public Criteria andMiniprogramLessThan(String value) {
            addCriterion("miniProgram <", value, "miniprogram");
            return (Criteria) this;
        }

        public Criteria andMiniprogramLessThanOrEqualTo(String value) {
            addCriterion("miniProgram <=", value, "miniprogram");
            return (Criteria) this;
        }

        public Criteria andMiniprogramLike(String value) {
            addCriterion("miniProgram like", value, "miniprogram");
            return (Criteria) this;
        }

        public Criteria andMiniprogramNotLike(String value) {
            addCriterion("miniProgram not like", value, "miniprogram");
            return (Criteria) this;
        }

        public Criteria andMiniprogramIn(List<String> values) {
            addCriterion("miniProgram in", values, "miniprogram");
            return (Criteria) this;
        }

        public Criteria andMiniprogramNotIn(List<String> values) {
            addCriterion("miniProgram not in", values, "miniprogram");
            return (Criteria) this;
        }

        public Criteria andMiniprogramBetween(String value1, String value2) {
            addCriterion("miniProgram between", value1, value2, "miniprogram");
            return (Criteria) this;
        }

        public Criteria andMiniprogramNotBetween(String value1, String value2) {
            addCriterion("miniProgram not between", value1, value2, "miniprogram");
            return (Criteria) this;
        }

        public Criteria andBloggoldIsNull() {
            addCriterion("blogGold is null");
            return (Criteria) this;
        }

        public Criteria andBloggoldIsNotNull() {
            addCriterion("blogGold is not null");
            return (Criteria) this;
        }

        public Criteria andBloggoldEqualTo(Integer value) {
            addCriterion("blogGold =", value, "bloggold");
            return (Criteria) this;
        }

        public Criteria andBloggoldNotEqualTo(Integer value) {
            addCriterion("blogGold <>", value, "bloggold");
            return (Criteria) this;
        }

        public Criteria andBloggoldGreaterThan(Integer value) {
            addCriterion("blogGold >", value, "bloggold");
            return (Criteria) this;
        }

        public Criteria andBloggoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("blogGold >=", value, "bloggold");
            return (Criteria) this;
        }

        public Criteria andBloggoldLessThan(Integer value) {
            addCriterion("blogGold <", value, "bloggold");
            return (Criteria) this;
        }

        public Criteria andBloggoldLessThanOrEqualTo(Integer value) {
            addCriterion("blogGold <=", value, "bloggold");
            return (Criteria) this;
        }

        public Criteria andBloggoldIn(List<Integer> values) {
            addCriterion("blogGold in", values, "bloggold");
            return (Criteria) this;
        }

        public Criteria andBloggoldNotIn(List<Integer> values) {
            addCriterion("blogGold not in", values, "bloggold");
            return (Criteria) this;
        }

        public Criteria andBloggoldBetween(Integer value1, Integer value2) {
            addCriterion("blogGold between", value1, value2, "bloggold");
            return (Criteria) this;
        }

        public Criteria andBloggoldNotBetween(Integer value1, Integer value2) {
            addCriterion("blogGold not between", value1, value2, "bloggold");
            return (Criteria) this;
        }

        public Criteria andStausIsNull() {
            addCriterion("staus is null");
            return (Criteria) this;
        }

        public Criteria andStausIsNotNull() {
            addCriterion("staus is not null");
            return (Criteria) this;
        }

        public Criteria andStausEqualTo(Integer value) {
            addCriterion("staus =", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausNotEqualTo(Integer value) {
            addCriterion("staus <>", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausGreaterThan(Integer value) {
            addCriterion("staus >", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausGreaterThanOrEqualTo(Integer value) {
            addCriterion("staus >=", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausLessThan(Integer value) {
            addCriterion("staus <", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausLessThanOrEqualTo(Integer value) {
            addCriterion("staus <=", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausIn(List<Integer> values) {
            addCriterion("staus in", values, "staus");
            return (Criteria) this;
        }

        public Criteria andStausNotIn(List<Integer> values) {
            addCriterion("staus not in", values, "staus");
            return (Criteria) this;
        }

        public Criteria andStausBetween(Integer value1, Integer value2) {
            addCriterion("staus between", value1, value2, "staus");
            return (Criteria) this;
        }

        public Criteria andStausNotBetween(Integer value1, Integer value2) {
            addCriterion("staus not between", value1, value2, "staus");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNull() {
            addCriterion("permission is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNotNull() {
            addCriterion("permission is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionEqualTo(String value) {
            addCriterion("permission =", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotEqualTo(String value) {
            addCriterion("permission <>", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThan(String value) {
            addCriterion("permission >", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThanOrEqualTo(String value) {
            addCriterion("permission >=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThan(String value) {
            addCriterion("permission <", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThanOrEqualTo(String value) {
            addCriterion("permission <=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLike(String value) {
            addCriterion("permission like", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotLike(String value) {
            addCriterion("permission not like", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionIn(List<String> values) {
            addCriterion("permission in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotIn(List<String> values) {
            addCriterion("permission not in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionBetween(String value1, String value2) {
            addCriterion("permission between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotBetween(String value1, String value2) {
            addCriterion("permission not between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLocationaddressIsNull() {
            addCriterion("locationAddress is null");
            return (Criteria) this;
        }

        public Criteria andLocationaddressIsNotNull() {
            addCriterion("locationAddress is not null");
            return (Criteria) this;
        }

        public Criteria andLocationaddressEqualTo(String value) {
            addCriterion("locationAddress =", value, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressNotEqualTo(String value) {
            addCriterion("locationAddress <>", value, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressGreaterThan(String value) {
            addCriterion("locationAddress >", value, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressGreaterThanOrEqualTo(String value) {
            addCriterion("locationAddress >=", value, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressLessThan(String value) {
            addCriterion("locationAddress <", value, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressLessThanOrEqualTo(String value) {
            addCriterion("locationAddress <=", value, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressLike(String value) {
            addCriterion("locationAddress like", value, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressNotLike(String value) {
            addCriterion("locationAddress not like", value, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressIn(List<String> values) {
            addCriterion("locationAddress in", values, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressNotIn(List<String> values) {
            addCriterion("locationAddress not in", values, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressBetween(String value1, String value2) {
            addCriterion("locationAddress between", value1, value2, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressNotBetween(String value1, String value2) {
            addCriterion("locationAddress not between", value1, value2, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andMacaddressIsNull() {
            addCriterion("macAddress is null");
            return (Criteria) this;
        }

        public Criteria andMacaddressIsNotNull() {
            addCriterion("macAddress is not null");
            return (Criteria) this;
        }

        public Criteria andMacaddressEqualTo(String value) {
            addCriterion("macAddress =", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressNotEqualTo(String value) {
            addCriterion("macAddress <>", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressGreaterThan(String value) {
            addCriterion("macAddress >", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressGreaterThanOrEqualTo(String value) {
            addCriterion("macAddress >=", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressLessThan(String value) {
            addCriterion("macAddress <", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressLessThanOrEqualTo(String value) {
            addCriterion("macAddress <=", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressLike(String value) {
            addCriterion("macAddress like", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressNotLike(String value) {
            addCriterion("macAddress not like", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressIn(List<String> values) {
            addCriterion("macAddress in", values, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressNotIn(List<String> values) {
            addCriterion("macAddress not in", values, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressBetween(String value1, String value2) {
            addCriterion("macAddress between", value1, value2, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressNotBetween(String value1, String value2) {
            addCriterion("macAddress not between", value1, value2, "macaddress");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNull() {
            addCriterion("loginTime is null");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNotNull() {
            addCriterion("loginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimeEqualTo(Date value) {
            addCriterion("loginTime =", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotEqualTo(Date value) {
            addCriterion("loginTime <>", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThan(Date value) {
            addCriterion("loginTime >", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("loginTime >=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThan(Date value) {
            addCriterion("loginTime <", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThanOrEqualTo(Date value) {
            addCriterion("loginTime <=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIn(List<Date> values) {
            addCriterion("loginTime in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotIn(List<Date> values) {
            addCriterion("loginTime not in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeBetween(Date value1, Date value2) {
            addCriterion("loginTime between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotBetween(Date value1, Date value2) {
            addCriterion("loginTime not between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIsNull() {
            addCriterion("idCardNo is null");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIsNotNull() {
            addCriterion("idCardNo is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardnoEqualTo(String value) {
            addCriterion("idCardNo =", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotEqualTo(String value) {
            addCriterion("idCardNo <>", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoGreaterThan(String value) {
            addCriterion("idCardNo >", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoGreaterThanOrEqualTo(String value) {
            addCriterion("idCardNo >=", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLessThan(String value) {
            addCriterion("idCardNo <", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLessThanOrEqualTo(String value) {
            addCriterion("idCardNo <=", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLike(String value) {
            addCriterion("idCardNo like", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotLike(String value) {
            addCriterion("idCardNo not like", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIn(List<String> values) {
            addCriterion("idCardNo in", values, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotIn(List<String> values) {
            addCriterion("idCardNo not in", values, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoBetween(String value1, String value2) {
            addCriterion("idCardNo between", value1, value2, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotBetween(String value1, String value2) {
            addCriterion("idCardNo not between", value1, value2, "idcardno");
            return (Criteria) this;
        }

        public Criteria andTruenameIsNull() {
            addCriterion("trueName is null");
            return (Criteria) this;
        }

        public Criteria andTruenameIsNotNull() {
            addCriterion("trueName is not null");
            return (Criteria) this;
        }

        public Criteria andTruenameEqualTo(String value) {
            addCriterion("trueName =", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotEqualTo(String value) {
            addCriterion("trueName <>", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameGreaterThan(String value) {
            addCriterion("trueName >", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("trueName >=", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLessThan(String value) {
            addCriterion("trueName <", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLessThanOrEqualTo(String value) {
            addCriterion("trueName <=", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLike(String value) {
            addCriterion("trueName like", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotLike(String value) {
            addCriterion("trueName not like", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameIn(List<String> values) {
            addCriterion("trueName in", values, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotIn(List<String> values) {
            addCriterion("trueName not in", values, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameBetween(String value1, String value2) {
            addCriterion("trueName between", value1, value2, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotBetween(String value1, String value2) {
            addCriterion("trueName not between", value1, value2, "truename");
            return (Criteria) this;
        }

        public Criteria andRanktypeIsNull() {
            addCriterion("rankType is null");
            return (Criteria) this;
        }

        public Criteria andRanktypeIsNotNull() {
            addCriterion("rankType is not null");
            return (Criteria) this;
        }

        public Criteria andRanktypeEqualTo(Integer value) {
            addCriterion("rankType =", value, "ranktype");
            return (Criteria) this;
        }

        public Criteria andRanktypeNotEqualTo(Integer value) {
            addCriterion("rankType <>", value, "ranktype");
            return (Criteria) this;
        }

        public Criteria andRanktypeGreaterThan(Integer value) {
            addCriterion("rankType >", value, "ranktype");
            return (Criteria) this;
        }

        public Criteria andRanktypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rankType >=", value, "ranktype");
            return (Criteria) this;
        }

        public Criteria andRanktypeLessThan(Integer value) {
            addCriterion("rankType <", value, "ranktype");
            return (Criteria) this;
        }

        public Criteria andRanktypeLessThanOrEqualTo(Integer value) {
            addCriterion("rankType <=", value, "ranktype");
            return (Criteria) this;
        }

        public Criteria andRanktypeIn(List<Integer> values) {
            addCriterion("rankType in", values, "ranktype");
            return (Criteria) this;
        }

        public Criteria andRanktypeNotIn(List<Integer> values) {
            addCriterion("rankType not in", values, "ranktype");
            return (Criteria) this;
        }

        public Criteria andRanktypeBetween(Integer value1, Integer value2) {
            addCriterion("rankType between", value1, value2, "ranktype");
            return (Criteria) this;
        }

        public Criteria andRanktypeNotBetween(Integer value1, Integer value2) {
            addCriterion("rankType not between", value1, value2, "ranktype");
            return (Criteria) this;
        }

        public Criteria andRanknameIsNull() {
            addCriterion("rankName is null");
            return (Criteria) this;
        }

        public Criteria andRanknameIsNotNull() {
            addCriterion("rankName is not null");
            return (Criteria) this;
        }

        public Criteria andRanknameEqualTo(String value) {
            addCriterion("rankName =", value, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameNotEqualTo(String value) {
            addCriterion("rankName <>", value, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameGreaterThan(String value) {
            addCriterion("rankName >", value, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameGreaterThanOrEqualTo(String value) {
            addCriterion("rankName >=", value, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameLessThan(String value) {
            addCriterion("rankName <", value, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameLessThanOrEqualTo(String value) {
            addCriterion("rankName <=", value, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameLike(String value) {
            addCriterion("rankName like", value, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameNotLike(String value) {
            addCriterion("rankName not like", value, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameIn(List<String> values) {
            addCriterion("rankName in", values, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameNotIn(List<String> values) {
            addCriterion("rankName not in", values, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameBetween(String value1, String value2) {
            addCriterion("rankName between", value1, value2, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameNotBetween(String value1, String value2) {
            addCriterion("rankName not between", value1, value2, "rankname");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPhonetypeIsNull() {
            addCriterion("phonetype is null");
            return (Criteria) this;
        }

        public Criteria andPhonetypeIsNotNull() {
            addCriterion("phonetype is not null");
            return (Criteria) this;
        }

        public Criteria andPhonetypeEqualTo(String value) {
            addCriterion("phonetype =", value, "phonetype");
            return (Criteria) this;
        }

        public Criteria andPhonetypeNotEqualTo(String value) {
            addCriterion("phonetype <>", value, "phonetype");
            return (Criteria) this;
        }

        public Criteria andPhonetypeGreaterThan(String value) {
            addCriterion("phonetype >", value, "phonetype");
            return (Criteria) this;
        }

        public Criteria andPhonetypeGreaterThanOrEqualTo(String value) {
            addCriterion("phonetype >=", value, "phonetype");
            return (Criteria) this;
        }

        public Criteria andPhonetypeLessThan(String value) {
            addCriterion("phonetype <", value, "phonetype");
            return (Criteria) this;
        }

        public Criteria andPhonetypeLessThanOrEqualTo(String value) {
            addCriterion("phonetype <=", value, "phonetype");
            return (Criteria) this;
        }

        public Criteria andPhonetypeLike(String value) {
            addCriterion("phonetype like", value, "phonetype");
            return (Criteria) this;
        }

        public Criteria andPhonetypeNotLike(String value) {
            addCriterion("phonetype not like", value, "phonetype");
            return (Criteria) this;
        }

        public Criteria andPhonetypeIn(List<String> values) {
            addCriterion("phonetype in", values, "phonetype");
            return (Criteria) this;
        }

        public Criteria andPhonetypeNotIn(List<String> values) {
            addCriterion("phonetype not in", values, "phonetype");
            return (Criteria) this;
        }

        public Criteria andPhonetypeBetween(String value1, String value2) {
            addCriterion("phonetype between", value1, value2, "phonetype");
            return (Criteria) this;
        }

        public Criteria andPhonetypeNotBetween(String value1, String value2) {
            addCriterion("phonetype not between", value1, value2, "phonetype");
            return (Criteria) this;
        }

        public Criteria andSystemversionIsNull() {
            addCriterion("systemversion is null");
            return (Criteria) this;
        }

        public Criteria andSystemversionIsNotNull() {
            addCriterion("systemversion is not null");
            return (Criteria) this;
        }

        public Criteria andSystemversionEqualTo(String value) {
            addCriterion("systemversion =", value, "systemversion");
            return (Criteria) this;
        }

        public Criteria andSystemversionNotEqualTo(String value) {
            addCriterion("systemversion <>", value, "systemversion");
            return (Criteria) this;
        }

        public Criteria andSystemversionGreaterThan(String value) {
            addCriterion("systemversion >", value, "systemversion");
            return (Criteria) this;
        }

        public Criteria andSystemversionGreaterThanOrEqualTo(String value) {
            addCriterion("systemversion >=", value, "systemversion");
            return (Criteria) this;
        }

        public Criteria andSystemversionLessThan(String value) {
            addCriterion("systemversion <", value, "systemversion");
            return (Criteria) this;
        }

        public Criteria andSystemversionLessThanOrEqualTo(String value) {
            addCriterion("systemversion <=", value, "systemversion");
            return (Criteria) this;
        }

        public Criteria andSystemversionLike(String value) {
            addCriterion("systemversion like", value, "systemversion");
            return (Criteria) this;
        }

        public Criteria andSystemversionNotLike(String value) {
            addCriterion("systemversion not like", value, "systemversion");
            return (Criteria) this;
        }

        public Criteria andSystemversionIn(List<String> values) {
            addCriterion("systemversion in", values, "systemversion");
            return (Criteria) this;
        }

        public Criteria andSystemversionNotIn(List<String> values) {
            addCriterion("systemversion not in", values, "systemversion");
            return (Criteria) this;
        }

        public Criteria andSystemversionBetween(String value1, String value2) {
            addCriterion("systemversion between", value1, value2, "systemversion");
            return (Criteria) this;
        }

        public Criteria andSystemversionNotBetween(String value1, String value2) {
            addCriterion("systemversion not between", value1, value2, "systemversion");
            return (Criteria) this;
        }

        public Criteria andUniqueidIsNull() {
            addCriterion("uniqueid is null");
            return (Criteria) this;
        }

        public Criteria andUniqueidIsNotNull() {
            addCriterion("uniqueid is not null");
            return (Criteria) this;
        }

        public Criteria andUniqueidEqualTo(String value) {
            addCriterion("uniqueid =", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidNotEqualTo(String value) {
            addCriterion("uniqueid <>", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidGreaterThan(String value) {
            addCriterion("uniqueid >", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidGreaterThanOrEqualTo(String value) {
            addCriterion("uniqueid >=", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidLessThan(String value) {
            addCriterion("uniqueid <", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidLessThanOrEqualTo(String value) {
            addCriterion("uniqueid <=", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidLike(String value) {
            addCriterion("uniqueid like", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidNotLike(String value) {
            addCriterion("uniqueid not like", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidIn(List<String> values) {
            addCriterion("uniqueid in", values, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidNotIn(List<String> values) {
            addCriterion("uniqueid not in", values, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidBetween(String value1, String value2) {
            addCriterion("uniqueid between", value1, value2, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidNotBetween(String value1, String value2) {
            addCriterion("uniqueid not between", value1, value2, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andAppversionIsNull() {
            addCriterion("appVersion is null");
            return (Criteria) this;
        }

        public Criteria andAppversionIsNotNull() {
            addCriterion("appVersion is not null");
            return (Criteria) this;
        }

        public Criteria andAppversionEqualTo(String value) {
            addCriterion("appVersion =", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionNotEqualTo(String value) {
            addCriterion("appVersion <>", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionGreaterThan(String value) {
            addCriterion("appVersion >", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionGreaterThanOrEqualTo(String value) {
            addCriterion("appVersion >=", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionLessThan(String value) {
            addCriterion("appVersion <", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionLessThanOrEqualTo(String value) {
            addCriterion("appVersion <=", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionLike(String value) {
            addCriterion("appVersion like", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionNotLike(String value) {
            addCriterion("appVersion not like", value, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionIn(List<String> values) {
            addCriterion("appVersion in", values, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionNotIn(List<String> values) {
            addCriterion("appVersion not in", values, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionBetween(String value1, String value2) {
            addCriterion("appVersion between", value1, value2, "appversion");
            return (Criteria) this;
        }

        public Criteria andAppversionNotBetween(String value1, String value2) {
            addCriterion("appVersion not between", value1, value2, "appversion");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andSpeakingIsNull() {
            addCriterion("speaking is null");
            return (Criteria) this;
        }

        public Criteria andSpeakingIsNotNull() {
            addCriterion("speaking is not null");
            return (Criteria) this;
        }

        public Criteria andSpeakingEqualTo(Integer value) {
            addCriterion("speaking =", value, "speaking");
            return (Criteria) this;
        }

        public Criteria andSpeakingNotEqualTo(Integer value) {
            addCriterion("speaking <>", value, "speaking");
            return (Criteria) this;
        }

        public Criteria andSpeakingGreaterThan(Integer value) {
            addCriterion("speaking >", value, "speaking");
            return (Criteria) this;
        }

        public Criteria andSpeakingGreaterThanOrEqualTo(Integer value) {
            addCriterion("speaking >=", value, "speaking");
            return (Criteria) this;
        }

        public Criteria andSpeakingLessThan(Integer value) {
            addCriterion("speaking <", value, "speaking");
            return (Criteria) this;
        }

        public Criteria andSpeakingLessThanOrEqualTo(Integer value) {
            addCriterion("speaking <=", value, "speaking");
            return (Criteria) this;
        }

        public Criteria andSpeakingIn(List<Integer> values) {
            addCriterion("speaking in", values, "speaking");
            return (Criteria) this;
        }

        public Criteria andSpeakingNotIn(List<Integer> values) {
            addCriterion("speaking not in", values, "speaking");
            return (Criteria) this;
        }

        public Criteria andSpeakingBetween(Integer value1, Integer value2) {
            addCriterion("speaking between", value1, value2, "speaking");
            return (Criteria) this;
        }

        public Criteria andSpeakingNotBetween(Integer value1, Integer value2) {
            addCriterion("speaking not between", value1, value2, "speaking");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}