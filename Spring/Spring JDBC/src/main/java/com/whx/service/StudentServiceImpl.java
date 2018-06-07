package com.whx.service;

import com.whx.bean.Student;
import com.whx.dao.StudentDao;

import java.io.Serializable;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao dao;

    public StudentDao getDao() {
        return dao;
    }

    public void setDao(StudentDao dao) {
        this.dao = dao;
    }

    @Override
    public void add(Student student) {
        dao.add(student);
    }

    @Override
    public void del(Serializable id) {
            dao.del(id);
    }

    @Override
    public void update(Student student) {
            dao.update(student);
    }

    @Override
    public List<Student> getAll() {
        return dao.getAll();
    }
}
