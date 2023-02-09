package com.wdz.demo.design.decorator.test;

import com.wdz.demo.design.decorator.ConcreteComponent;
import com.wdz.demo.design.decorator.DecoratorA;
import com.wdz.demo.design.decorator.DecoratorB;

/**
 * @author by Wangdezhao
 * @date 2023/2/7 16:12 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public class TestDecorator {
    public static void main(String[] args) {
        System.out.println("Decorator design pattern");

        System.out.println("\nDecoratorA: \n");
        new DecoratorA(new ConcreteComponent()).doSomething();

        System.out.println("\nDecoratorB: \n");
        new DecoratorB(new ConcreteComponent()).doSomething();
    }
}
