package com.whx.service;

public interface StockService {
    //谁花了多少钱 购买了多少股票
    void buyStock(String name,double money,int amount);
}
