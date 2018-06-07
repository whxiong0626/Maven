package com.whx.dao;

import com.whx.bean.Student;

import java.io.Serializable;
import java.util.List;

public interface StudentDao {
    void add(Student student);
    void del(Serializable id);
    void update(Student student);
    List<Student> getAll();
}
