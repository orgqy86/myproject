package com.aaa.dp.factory.abstracts;

import com.aaa.dp.factory.simple.SoftwareTechnology;

/**
 * className:PHPDevelop
 * discriptoin:
 * author:zz
 * createTime:2018-10-25 15:01
 */
public class PHPDevelop implements SoftwareTechnology {
    @Override
    public void study() {
        System.out.println("学会了PHP技术,升级加薪,迎娶白富美走向人生巅峰...");
    }
}
