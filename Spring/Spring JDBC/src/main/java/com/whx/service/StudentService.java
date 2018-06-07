package com.whx.service;

import com.whx.bean.Student;

import java.io.Serializable;
import java.util.List;

public interface StudentService {
    void add(Student student);
    void del(Serializable id);
    void update(Student student);
    List<Student> getAll();
}
