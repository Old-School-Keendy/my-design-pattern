package com.wdz.demo.design.decorator.guc;

import java.util.stream.Stream;

/**
 * @author by Wangdezhao
 * @date 2023/2/8 14:17 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public class StreamParallelDemo {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
            .parallel()
            .reduce((a, b) -> {
                System.out.printf("%s: %d + %d = %d%n",
                    Thread.currentThread().getName(), a, b, a + b);
                return a + b;
            })
            .ifPresent(System.out::println);
    }
}
