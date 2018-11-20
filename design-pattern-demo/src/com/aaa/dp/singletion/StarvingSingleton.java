package com.aaa.dp.singletion;

/**
 * className:StarvingSingleton
 * discriptoin: 懒汉模式
 * 懒汉和饿汉区别:
 *     1,当前类的加载速度  懒汉类加载速度快
 *     2,运行时获取单例对象的速度  懒汉获取速度慢
 *     3,单例对象存在的时间
 *            懒汉模式调用获取方式时,单例对象产生,饿汉的该类加载后,一直存在
 * author:zz
 * createTime:2018-10-25 15:47
 */
public class StarvingSingleton {

    //1,私有的构造  保证该类在其他地方不能被实例化对象
    private StarvingSingleton(){};
    //2,私有的,静态的本类的一个实例 , 私有的保证在其他地方不被调用,静态的,保证类产生时产生,只产生一次
    private  static StarvingSingleton starvingSingleton = null;
    //3,提供一个共有的,静态的方法  保证对外可以直接获取对象,静态的通过类名称调用(因为不能创建对象)
    public    static StarvingSingleton getInstance(){ //同步 方法使用 synchronized
        synchronized(StarvingSingleton.class) { // 同步块
            //判断对象是否为空
            if (starvingSingleton == null) {
                starvingSingleton = new StarvingSingleton();
            }
        }
        return starvingSingleton;
    }
}
