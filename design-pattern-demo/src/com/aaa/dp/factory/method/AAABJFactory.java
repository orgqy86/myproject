package com.aaa.dp.factory.method;

import com.aaa.dp.factory.simple.SoftwareTechnology;

/**
 * className:AAABJFactory
 * discriptoin:
 * author:zz
 * createTime:2018-10-25 14:45
 */
public class AAABJFactory implements GBAAAFactory {

    @Override
    public SoftwareTechnology studyST() {
        return new BigDataDeveLop();
    }
}
