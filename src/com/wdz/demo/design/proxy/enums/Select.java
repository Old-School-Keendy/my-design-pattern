package com.wdz.demo.design.proxy.enums;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义select注解,模拟mybatis
 * @author by Wangdezhao
 * @date 2023/2/9 11:16 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Select {
    String value() default "";
}
