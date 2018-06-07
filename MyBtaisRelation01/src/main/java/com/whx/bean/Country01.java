package com.whx.bean;

public class Country01 {
    private int cid;
    private String cname;

    public Country01(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }
    public Country01() {
        super();
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Country01{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }
}
