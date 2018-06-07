package com.whx.dao;

import com.whx.bean.Teacher01;

import java.io.Serializable;

public interface Teacher01Dao {
    /**
     * 根据老师的编号 查询  所有导师的信息
     * 递归查询
     */

    Teacher01 findTeachersById(Serializable id);
}
