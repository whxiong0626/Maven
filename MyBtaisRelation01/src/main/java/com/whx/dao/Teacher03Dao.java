package com.whx.dao;

import com.whx.bean.Student03;
import com.whx.bean.Teacher03;

import java.io.Serializable;

public interface Teacher03Dao {
    /**
     * 根据学生的编号 查询出对应的所有老师信息
     */
    Student03 selectTeachersBySid(Serializable id);
    /**
     * 根据老师的编号 查询出对应的所有学生信息
     */
    Teacher03 selectStudentsByTid(Serializable id);
}
