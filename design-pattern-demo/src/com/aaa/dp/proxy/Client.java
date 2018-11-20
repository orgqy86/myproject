package com.aaa.dp.proxy;

/**
 * className:Client
 * discriptoin:客户类(委托类)
 * author:zz
 * createTime:2018-10-25 16:48
 */
public class Client  implements  Account{
    @Override
    public void queryAccountMoney() {
        System.out.println("执行查询余额功能!!!");
    }

    @Override
    public void updateMoney(double money) {
        System.out.println("存/取了"+money+"元钱!!!");
    }
}
