package com.whx.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
public interface BaseDao<T>{
    /**
     *   新增
     */
    void add(T t);
    /**
     *   查询用户ID
     */
    void  addId(T t);
    /*
     *  删除
    */
    void delete(Serializable id);
    /*
   *  修改
  */
    void update(T t);
    /**
     *   查询所有
     */
    List<T> findAll();

    /**
     * 查询所有 返回map集合
     */
    Map<String ,Object> findAllByMap();

    /**
     * 查询指定的user 返回User对象
     */
    Object findById(Serializable id);

    /**
     * 根据姓名模糊查询
     */
    List<T> findByName(String name);
}
