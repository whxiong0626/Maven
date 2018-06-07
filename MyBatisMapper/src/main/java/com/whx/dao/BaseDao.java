package com.whx.dao;

import com.whx.bean.User;
import org.apache.ibatis.annotations.Param;

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
    List<Map<String ,Object>> findAllByMap();

    /**
     * 查询指定的user 返回User对象
     */
    Object findById(Serializable id);

    /**
     * 根据姓名模糊查询
     */
    List<T> findByName(String name);


     //多条件查询

    /**
     * 如果前台表单中给出的查询条件不能封装成一个对象的时候，
     * 我们可以使用两种方式来解决这个问题！
     * 第一种方式
     *   01.把查询条件 封装成map
     *    使用map 查询 姓名中带  小  并且年龄大于100的学生信息
     *
     *   02.使用map 查询 姓名中带  小 ，年龄大于100 并且id 大于小白id的 学生信息
     */
    List<T> selectByMap(Map<String,Object> map);


    /**
     * 第二种方式
     *   查询 姓名中带  小  并且年龄大于100的学生信息
     */
    /*List<T> selectByCondition(String name,int age);*/
    /*
     * 用索引查询
     */
    List<T> findParams1(String string,Serializable id);
    /*
     * 使用注解查询
     */
    List<T> findParams2(@Param("me")String string1, @Param("em")String string2);

    /*if语句判断*/
    List<T> selectByIf(T t);

    /*choose语句判断*/
    List<T> selectByChoose(T t);

    /*Foreach数组,foreach  遍历数组*/
    List<T> selectByForeachArray(int[]index);

    /*Foreach List集合，foreach  遍历集合*/
    List<T> selectByForeachList(List<Integer> index);
}
