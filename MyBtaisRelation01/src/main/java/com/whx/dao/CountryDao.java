package com.whx.dao;


import com.whx.bean.Country;
import com.whx.bean.Provincial01;

import java.io.Serializable;

public interface CountryDao {
    /**
     * 根据国家的编号  查询出 国家对应省会的信息
     * 返回值是 Country  因为实体类中有
     *   private Set<Provincial> provincials;
     */
    Country selectCountryById(Serializable id);

    /**
     * 根据省会的id 查询出 省会 以及对应的国家

    Provincial01 selectProvincialById(Serializable id);
     */
}
