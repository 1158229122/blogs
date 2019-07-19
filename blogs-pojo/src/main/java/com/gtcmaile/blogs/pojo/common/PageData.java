package com.gtcmaile.blogs.pojo.common;

import lombok.Data;

import java.util.List;

/**
 * @Author: jim
 * @Date: 2019/7/19 10:31
 * @Version 1.0
 */
@Data
public class PageData<T> {
    private Integer total;
    private List<T> list;
}
