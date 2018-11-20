package com.aaa.dp.singletion;

/**
 * className:SingletonTest
 * discriptoin:
 * author:zz
 * createTime:2018-10-25 15:48
 */
public class SingletonTest {
    public static void main(String[] args) {
        StarvingSingleton instance = StarvingSingleton.getInstance();
        StarvingSingleton instance1 = StarvingSingleton.getInstance();
        //== 表示两个对象如果指向同一块内存空间
        System.out.println("懒汉:"+(instance==instance1));

        SlackerSingleton slackerSingleton = SlackerSingleton.getInstance();
        SlackerSingleton slackerSingleton1 = SlackerSingleton.getInstance();
        System.out.println("饿汉"+(slackerSingleton==slackerSingleton1));
    }
}
