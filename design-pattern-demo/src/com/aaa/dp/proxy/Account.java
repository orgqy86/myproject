package com.aaa.dp.proxy;

/**
 * 银行账户相关接口
 */
public interface Account {

    /**
     * 查询余额
     */
    void queryAccountMoney();

    /**
     * 存取钱
     * @param money
     */
    void  updateMoney(double money);
}
