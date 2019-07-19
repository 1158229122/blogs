package com.gtcmaile.blogs.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: jim
 * @Date: 2019/7/19 17:26
 * @Version 1.0
 * 用于表示那个主建唯一标识
 */
@Target(ElementType.FIELD)//作用在字段上面
@Retention(RetentionPolicy.RUNTIME)
public @interface IsID {
}
