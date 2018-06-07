package com.whx.bean;

public class Grade {
    private int id;
    private String gname;

    public Grade() {
        super();
    }

    public Grade(int id, String gname) {
        this.id = id;
        this.gname = gname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", gname='" + gname + '\'' +
                '}';
    }
}
