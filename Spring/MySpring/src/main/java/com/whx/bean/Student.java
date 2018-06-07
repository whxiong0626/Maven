package com.whx.bean;

public class Student {
    private  Integer age;
    private String  name;
    private String id;

    public Student() {
        System.out.println("student类中的无参构造");
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
