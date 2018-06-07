package com.whx.bean;

public class Provincial {
   private int pid;
   private String pname;
   public Country country;
    public  Provincial(){
        super();
    }

    public Provincial(String pname, Country country) {
        this.pname = pname;
        this.country = country;
    }

    public Provincial(String pname, int countryid) {
        this.pname = pname;

    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }



    @Override
    public String toString() {
        return "Provincial{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                '}';
    }
}
