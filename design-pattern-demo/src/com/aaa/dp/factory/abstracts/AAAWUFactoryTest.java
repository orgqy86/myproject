package com.aaa.dp.factory.abstracts;

import com.aaa.dp.factory.simple.SoftwareTechnology;

/**
 * className:AAAWUFactoryTest
 * discriptoin:
 * author:zz
 * createTime:2018-10-25 15:06
 */
public class AAAWUFactoryTest {
    public static void main(String[] args) {
        AAAWHFactory aaawhFactory = new AAAWHFactory();
        SoftwareTechnology softwareTechnology = aaawhFactory.studyST();
        softwareTechnology.study();
        UITechnology uiTechnology = aaawhFactory.studyUI();
        uiTechnology.study();
    }
}
