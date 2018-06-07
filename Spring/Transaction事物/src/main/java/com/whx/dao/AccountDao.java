package com.whx.dao;
//银行账户的接口
public interface AccountDao {
    //谁花了多少钱
    void updateAccount(String aname,double money);
}
