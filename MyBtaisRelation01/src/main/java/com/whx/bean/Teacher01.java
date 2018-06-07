package com.whx.bean;

public class Teacher01 {
    private   Integer  id;   //老师编号
    private   String   name;  //老师姓名
    //多个老师对应一个导师
    private   Teacher01  teacher;

    public Teacher01 getTeacher01() {
        return teacher;
    }

    public void setTeacher01(Teacher01 teacher) {
        this.teacher = teacher;
    }

    public Teacher01(Integer id, String name,Teacher01 teacher) {
        this.id = id;
        this.name = name;
        this.teacher=teacher;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Teacher01() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
