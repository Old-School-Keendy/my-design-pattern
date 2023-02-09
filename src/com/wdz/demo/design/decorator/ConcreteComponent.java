package com.wdz.demo.design.decorator;

/**
 * @author by Wangdezhao
 * @date 2023/2/7 16:03 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public class ConcreteComponent implements Component {
    @Override
    public void doSomething() {
        System.out.println("ConcreteComponent, do something");
    }
}
