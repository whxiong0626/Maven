package com.whx.bean;

public class Provincial01 {
    private Integer pid;
    private String pname;
    public Country01 country;
    public  Provincial01(){
        super();
    }

    public Provincial01(String pname, Country01 country) {
        this.pname = pname;
        this.country = country;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Country01 getCountry() {
        return country;
    }

    public void setCountry(Country01 country) {
        this.country = country;
    }
    @Override
    public String toString() {
        return "Provincial{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", country=" + country +
                '}';
    }
}
