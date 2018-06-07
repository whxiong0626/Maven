package com.whx;


import com.whx.bean.User;
import com.whx.dao.UserDao;
import com.whx.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserTest {
    UserDao dao=null;
    SqlSession sqlSession=null;
    Logger logger=Logger.getLogger(UserTest.class);

    /**
     * 在所有的test测试方法执行之前 都要执行的操作
     */
    @Before
    public void before(){
        //获取session
        sqlSession= SessionFactoryUtil.getsession();
        dao=sqlSession.getMapper(UserDao.class);
    }
    @After
    public void after(){
        if (sqlSession!=null){
            sqlSession.close();
        }
    }

    /**
     * 新增用户信息到数据库
     */
    @Test
    public void testAddUser(){
        User user=new User("heihei88","嘿嘿88","111",1,"123456","36@qq.com","123456789",1);
        dao.add(user);
        sqlSession.commit();
    }

    /**
     * 查询新增用户id
     */
    @Test
    public void testAddId(){
        User user=new User("heihei88","嘿嘿88","111",1,"123456","36@qq.com","123456789",1);
        dao.addId(user);
        logger.debug("insert后的用户id是："+user.getId());
        sqlSession.commit();
    }

    /**
     * 根据id删除用户
     */
    @Test
    public void testDeleteUser(){
        dao.delete(97);
        sqlSession.commit();
    }

    /**
     * 根据ID修改用户信息
     */
    @Test
    public void testUpadateUser(){
        User user=new User();
        user.setId(100);
        user.setUserName("hahaha");
        user.setEmail("78@qq.com");
        user.setIdentityCode("895151");
        user.setMobile("1515465");
        dao.update(user);
        sqlSession.commit();
    }

    /**
     * 查询所有用户信息
     */
    @Test
    public void testFindAllUser(){
        List<User> user=dao.findAll();
        sqlSession.commit();
    }

    /**
     * 查询所有 返回map
     */
    @Test
    public void mapStudent() {
        List<Map<String,Object>> user=dao.findAllByMap();
        logger.debug(user.size());
    }

    /**
     * 查询指定用户信息
     */
    @Test
    public void testFindUserById() {
        User user=(User)dao.findById(100);
    }

    /**
     * 根据姓名模糊查询
     */
    @Test
    public void testFindByName(){
        List<User> users=dao.findByName("e");
    }

    /**
     * 使用map 查询 userName中带a ，loginName中带‘嘿’的用户信息
     */
    @Test
    public void testselectByMap(){
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("userName","a");
        map.put("loginName","嘿");
        List<User> user=dao.selectByMap(map);
        logger.debug(user);
    }

    //索引,查询userName中包含a，并且sex为1的用户信息
    @Test
    public void test2(){
        List<User> user=dao.findParams1("a",1);
        logger.debug(user);
    }

    //注解,查询userName中包含a，并且邮箱中带5的用户信息
    @Test
    public void test3(){
        List<User> user=dao.findParams2("a","5");
        logger.debug(user);
    }

    /*if语句判断*/
    @Test
    public void testIF(){
        User user=new User();
        user.setUserName("a");
        user.setEmail("5");
        List<User> users=dao.selectByIf(user);
        logger.debug(users);
    }

    /*choose语句判断*/
    @Test
    public void testChoose(){
        User user=new User();
        user.setUserName("魏");
        user.setLoginName("a");
        List<User> users=dao.selectByChoose(user);
        logger.debug(users);
    }

    /*Foreach遍历数组*/
    @Test
    public void testForeachArray(){
        int [] index={51,82,85};
        List<User> users=dao.selectByForeachArray(index);
        logger.debug(users);
    }

    /*Foreach遍历集合*/
    @Test
    public void testForeachList(){
        List<Integer> list=new ArrayList<Integer>();
        list.add(51);
        list.add(82);
        list.add(85);
        List<User> users=dao.selectByForeachList(list);
        logger.debug(users);
    }
}
