package com.aaa.dp.factory.abstracts;

import com.aaa.dp.factory.simple.SoftwareTechnology;

/**
 * className:AAAWHFactory
 * discriptoin:
 * author:zz
 * createTime:2018-10-25 15:05
 */
public class AAAWHFactory extends  AAAAbstractFactory {
    @Override
    UITechnology studyUI() {
        return new H5Develop();
    }

    @Override
    SoftwareTechnology studyST() {
        return new PHPDevelop();
    }
}
