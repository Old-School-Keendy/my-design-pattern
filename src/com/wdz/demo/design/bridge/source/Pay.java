package com.wdz.demo.design.bridge.source;

import com.wdz.demo.design.bridge.payMode.PayMode;

/**
 * @author by Wangdezhao
 * @date 2023/2/9 14:37 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public abstract class Pay {
   protected PayMode payMode;

    public Pay(PayMode payMode) {
        this.payMode = payMode;
    }

    /**
     * 付款
     * @return result
     */
    abstract String doPay(int amount);

}
