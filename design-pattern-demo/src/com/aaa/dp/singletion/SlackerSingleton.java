package com.aaa.dp.singletion;

/**
 * className:SlackerSingleton
 * discriptoin:饿汉模式
 * author:zz
 * createTime:2018-10-25 16:00
 */
public class SlackerSingleton {

    //1 私有构造
    private SlackerSingleton(){};
    //2 私有的静态的本类属性
    private static SlackerSingleton slackerSingleton = new SlackerSingleton();
    //3 公共的静态的方法,对象调用
    public static SlackerSingleton getInstance(){
        return slackerSingleton;
    }
}
