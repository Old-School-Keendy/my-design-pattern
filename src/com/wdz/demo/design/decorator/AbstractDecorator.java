package com.wdz.demo.design.decorator;

/**
 * @author by Wangdezhao
 * @date 2023/2/7 16:05 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public abstract class AbstractDecorator implements Component{
    private Component component;

    public AbstractDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void doSomething(){
        preEnhance();
        component.doSomething();
        postEnhance();
    }


    /**
     * 前置增强
     */
    protected abstract void preEnhance();

    /**
     * 后置增强
     */
    protected abstract void postEnhance();
}
