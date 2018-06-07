package com.whx.dao;
//股票的接口
public interface StockDao {
    //谁的股票增加了多少股
    void updateStock(String sname,int amount);
}
