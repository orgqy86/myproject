package com.aaa.dp.proxy;

/**
 * className:AccountTest
 * discriptoin:
 * author:zz
 * createTime:2018-10-25 16:54
 */
public class AccountTest {
    public static void main(String[] args) {
        Emp emp =new Emp(new Client());
        emp.queryAccountMoney();
        emp.updateMoney(1000000.111);
    }
}
