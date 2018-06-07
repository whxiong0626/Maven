package com.whx.dao;

import com.whx.bean.Provincial01;

import java.io.Serializable;

public interface Country01Dao {
    /**
     * 根据省会的id 查询出 省会 以及对应的国家
     */
    Provincial01 selectProvincialById(Serializable id);
}
