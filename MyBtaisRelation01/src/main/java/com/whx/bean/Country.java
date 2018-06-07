package com.whx.bean;

import java.util.Set;

public class Country {
    private Integer  cid;
    private String cname;
    //一个国家可以有多个省会
    private Set<Provincial> provincials;

    public Country(String cname, Set<Provincial> provincials) {
        this.cname = cname;
        this.provincials = provincials;
    }

    public Country() {
        super();
    }


    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Set<Provincial> getProvincials() {
        return provincials;
    }

    public void setProvincials(Set<Provincial> provincials) {
        this.provincials = provincials;
    }

    @Override
    public String toString() {
        return "Country{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", provincials=" + provincials +
                '}';
    }
}
