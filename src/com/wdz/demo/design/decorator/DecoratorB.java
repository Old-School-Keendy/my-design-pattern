package com.wdz.demo.design.decorator;

/**
 * @author by Wangdezhao
 * @date 2023/2/7 16:07 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public class DecoratorB extends AbstractDecorator{
    public DecoratorB(Component component) {
        super(component);
    }

    @Override
    protected void preEnhance() {
        System.out.println("DecoratorB: preEnhance done");
    }

    @Override
    protected void postEnhance() {
        System.out.println("DecoratorB: postEnhance done");
    }

    @Override
    public void doSomething() {
        super.doSomething();
    }
}
