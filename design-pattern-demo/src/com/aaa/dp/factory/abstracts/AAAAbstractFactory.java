package com.aaa.dp.factory.abstracts;

import com.aaa.dp.factory.simple.SoftwareTechnology;

/**
 * className:AAAAbstractFactory
 * discriptoin:
 * author:zz
 * createTime:2018-10-25 15:02
 */
public abstract class AAAAbstractFactory {

    /**
     * 学习前端技术
     * @return
     */
    abstract UITechnology studyUI();

    /**
     * 学习后端软件技术
     * @return
     */
    abstract SoftwareTechnology studyST();
}
