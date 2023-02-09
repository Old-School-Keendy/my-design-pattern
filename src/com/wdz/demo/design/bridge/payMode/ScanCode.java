package com.wdz.demo.design.bridge.payMode;

/**
 * @author by Wangdezhao
 * @date 2023/2/9 14:40 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public class ScanCode  implements PayMode {
    @Override
    public String offer() {
        return "ScanCode";
    }
}
