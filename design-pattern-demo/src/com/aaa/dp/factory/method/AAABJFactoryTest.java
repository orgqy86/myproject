package com.aaa.dp.factory.method;

import com.aaa.dp.factory.simple.SoftwareTechnology;

/**
 * className:AAABJFactoryTest
 * discriptoin:
 * author:zz
 * createTime:2018-10-25 14:50
 */
public class AAABJFactoryTest {

    public static void main(String[] args) {
        AAABJFactory aaabjFactory = new AAABJFactory();
        SoftwareTechnology softwareTechnology = aaabjFactory.studyST();
        softwareTechnology.study();
    }
}
