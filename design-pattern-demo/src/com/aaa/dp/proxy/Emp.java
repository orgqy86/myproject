package com.aaa.dp.proxy;

/**
 * className:Emp
 * discriptoin:雇佣类(代理类)
 * author:zz
 * createTime:2018-10-25 16:50
 */
public class Emp implements  Account{

    //委托类
    private Client client;

    //通过构造,拿到委托类
    public Emp(Client client) {
        this.client = client;
    }

    @Override
    public void queryAccountMoney() {
        System.out.println("调试好ATM机....");
        client.queryAccountMoney();
    }

    @Override
    public void updateMoney(double money) {
        System.out.println("准备现金....");
       client.updateMoney(money);
        System.out.println("事后处理....");
    }
}
