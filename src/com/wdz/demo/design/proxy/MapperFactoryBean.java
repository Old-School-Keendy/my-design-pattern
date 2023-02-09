package com.wdz.demo.design.proxy;

import java.lang.reflect.Method;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import com.wdz.demo.design.proxy.enums.Select;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

/**
 * @author by Wangdezhao
 * @date 2023/2/9 11:30 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {
    private final Class<T> mapperInterface;

    public MapperFactoryBean(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    @Override
    public T getObject() {
        InvocationHandler handler = (proxy, method, args) -> {
            Select select = method.getAnnotation(Select.class);
            System.out.printf("SQL：%s%n",select.value().replace("#{uId}", args[0].toString()));
            return args[0] + "代理模式";
        };
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{mapperInterface}, handler);
    }

    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }
}
