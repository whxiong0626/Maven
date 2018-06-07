package com.whx.service;

import com.whx.bean.Account;
import com.whx.dao.AccountDao;
import com.whx.dao.StockDao;
import com.whx.exception.BuyStockException;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class StockServiceImpl01 implements StockService {
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
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,rollbackFor = BuyStockException.class)
    public void buyStock(String name, double money, int amount) {
        accountDao.updateAccount(name,money);
        if (money<=0||account.balance<0){
            throw new BuyStockException("购买股票失败！");
        }
        //一人加股
        stockDao.updateStock(name,amount);
    }
}
