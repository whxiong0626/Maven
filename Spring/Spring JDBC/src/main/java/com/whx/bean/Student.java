package com.whx.bean;

public class Student {
    private Integer id;
    private String sname;
    private Integer age;

    public Student() {
        super();
    }

    public Student(String sname, Integer age) {
        this.sname = sname;
        this.age = age;
    }
    public Student(String sname, Integer age,Integer id) {
        this.id=id;
        this.sname = sname;
        this.age = age;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                '}';
    }
}
