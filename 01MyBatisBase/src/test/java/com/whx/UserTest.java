package com.whx;

import com.whx.bean.User;
import com.whx.dao.Impl.UserDaoImpl;
import com.whx.dao.UserDao;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;


public class UserTest {

    UserDao dao=null;
    Logger log=Logger.getLogger(UserTest.class);

    /**
     * 在所有的test测试方法执行之前 都要执行的操作
     */
    @Before
    public void before(){
        dao=new UserDaoImpl();
    }

    /**
     * 新增用户信息到数据库p
     */

    @Test
    public   void  testAddUser(){
        User user=new User("heihei33","嘿嘿32","111",1,"123456","36@qq.com","123456789",1);
       /* user.setLoginName("asd");
        user.setUserName("asdasd");
        user.setPassword("123");*/
        dao.add(user);
        /*
         * 我们现在的新增对象中 没有id
         * id是mysql数据库给我们生成的
         * 你没有去mysql数据库中查询！
         * id肯定沒值！
         */
       /* log.debug("insert之后学生的编号："+user.getId());*/
    }
    /**
     * 查询新增用户id
     */
    @Test
    public   void  testfindUserId(){
        User user=new User("heihei33","嘿嘿32","111",1,"123456","36@qq.com","123456789",1);
        dao.addId(user);
        log.debug("insert之后学生的编号："+user.getId());
    }
    /**
     * 根据id删除用户
     */
    @Test
    public void testDeleteUser(){
        dao.delete(71);
    }

    /**
     * 根据ID修改用户信息
     */
    @Test
    public void testUpadateUser(){
        User user=new User();
        user.setId(78);
        user.setUserName("hahaha11");
        user.setEmail("98@163.com");
        user.setIdentityCode("78945");
        user.setMobile("987465");
        dao.update(user);
    }

    /**
     * 查询所有用户信息
     */
    @Test
    public void testFindAllUser(){
        List<User> user = dao.findAll();
        log.debug(user);
    }

    /**
     * 查询所有 返回map
     */
    @Test
    public void mapStudent(){
        Map<String,Object> user = dao.findAllByMap();
        log.debug(user.size());
        //根据key获取一个对象
        log.debug(user.get("weihaixiong"));
    }

    /**
     * 查询指定用户信息
     */
    @Test
    public void testFindUserById(){
        User user = (User)dao.findById(80);
        log.debug(user);
    }

    /**
     * 根据姓名模糊查询
     */
    @Test
    public void testFindByName(){
        List<User> user = dao.findByName("a");
        log.debug(user);
    }
}
