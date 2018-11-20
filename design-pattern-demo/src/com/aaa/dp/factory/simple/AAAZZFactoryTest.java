package com.aaa.dp.factory.simple;

/**
 * className:AAAZZFactoryTest
 * discriptoin:
 * author:zz
 * createTime:2018-10-25 14:28
 */
public class AAAZZFactoryTest {

    public static void main(String[] args) {
        AAAZZFactory aaazzFactory =new AAAZZFactory();
        SoftwareTechnology st = aaazzFactory.teachST(2);
        if(st!=null){
            st.study();
        }
    }
}
