package com.wdz.demo.design.bridge.test;

import com.wdz.demo.design.bridge.payMode.FaceSwiping;
import com.wdz.demo.design.bridge.payMode.Fingerprint;
import com.wdz.demo.design.bridge.payMode.ScanCode;
import com.wdz.demo.design.bridge.source.WxPay;
import com.wdz.demo.design.bridge.source.ZfbPay;

/**
 * @author by Wangdezhao
 * @date 2023/2/9 14:56 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public class TestBridge {
    public static void main(String[] args) {

        System.out.println(new ZfbPay(new FaceSwiping()).doPay(99));
        System.out.println(new ZfbPay(new ScanCode()).doPay(19));
        System.out.println(new ZfbPay(new Fingerprint()).doPay(20));

        System.out.println(new WxPay(new ScanCode()).doPay(12));
        System.out.println(new WxPay(new Fingerprint()).doPay(33));
        System.out.println(new WxPay(new FaceSwiping()).doPay(77));

    }
}
