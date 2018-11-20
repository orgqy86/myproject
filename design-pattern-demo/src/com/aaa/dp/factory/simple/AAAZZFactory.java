package com.aaa.dp.factory.simple;

/**
 * className:AAAZZFactory
 * discriptoin:
 * author:zz
 * createTime:2018-10-25 14:25
 */
public class AAAZZFactory {

    /**
     * 培训软件技术
     * @param stType
     * @return
     */
    public SoftwareTechnology teachST(int stType){
        if (stType==1){
            return new JavaDevelop();
        }else if(stType==2){
            return new PythonDevelop();
        }else{
            return null;
        }
    }
}
