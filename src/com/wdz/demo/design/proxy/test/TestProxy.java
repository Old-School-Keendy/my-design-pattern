package com.wdz.demo.design.proxy.test;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import com.wdz.demo.design.proxy.IUserDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author by Wangdezhao
 * @date 2023/2/9 12:37 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public class TestProxy {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
        IUserDao userDao = beanFactory.getBean("userDao", IUserDao.class);
        String res = userDao.selectById("100001");
        System.out.printf("测试结果：%s%n", res);
    }


}
