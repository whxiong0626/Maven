package com.whx.bean;

import java.io.Serializable;

public class User implements Serializable{
    private String username;
    private String pwd;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
