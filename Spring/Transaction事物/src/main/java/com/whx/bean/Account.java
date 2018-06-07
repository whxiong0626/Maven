package com.whx.bean;

public class Account {
    private  int aid;
    private  String aname;//账户名称
    public double balance;//账户余额

    public Account(int aid, String aname, double balance) {
        this.aid = aid;
        this.aname = aname;
        this.balance = balance;
    }

    public Account() {

    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", balance=" + balance +
                '}';
    }
}
