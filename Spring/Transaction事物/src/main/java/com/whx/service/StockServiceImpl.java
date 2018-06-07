package com.whx.service;

import com.whx.bean.Account;
import com.whx.dao.AccountDao;
import com.whx.dao.StockDao;
import com.whx.exception.BuyStockException;

public class StockServiceImpl implements StockService {
    //创建账户和股票接口的对象
    private AccountDao accountDao;

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public StockDao getStockDao() {
        return stockDao;
    }

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }
    Account account=new Account();
    private StockDao stockDao;
    public void buyStock(String name, double money, int amount) {
        accountDao.updateAccount(name,money);
        if (money<=0){
            throw new BuyStockException("购买股票失败！");
        }
        //一人加股
        stockDao.updateStock(name,amount);
    }
}
