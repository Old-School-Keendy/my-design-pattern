package com.wdz.demo.design.bridge.source;

import com.wdz.demo.design.bridge.payMode.PayMode;

/**
 * @author by Wangdezhao
 * @date 2023/2/9 14:38 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public class WxPay extends Pay {

    public WxPay(PayMode payMode) {
        super(payMode);
    }

    @Override
    public String doPay(int amount) {
        System.out.println("wx支付成功");
        System.out.println("支付方式: "+ payMode.offer());
        return "支付金额: " + amount;
    }
}
