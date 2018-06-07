package com.whx.bean;

import java.util.HashSet;
import java.util.Set;

public class Teacher03 {
    private  Integer  tid;
    private  String  tName;
    //一个老师可以有多个学生
    private Set<Student03> students=new HashSet<Student03>();

    public Set<Student03> getStudents() {
        return students;
    }

    public void setStudents(Set<Student03> students) {
        this.students = students;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public Teacher03() {
    }

    public Teacher03(Integer tid, String tName) {
        this.tid = tid;
        this.tName = tName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tName='" + tName + '\'' +
                ", students=" + students +
                '}';
    }
}
