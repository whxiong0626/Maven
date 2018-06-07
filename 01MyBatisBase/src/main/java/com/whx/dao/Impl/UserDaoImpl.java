package com.whx.dao.Impl;

import com.whx.bean.User;
import com.whx.dao.UserDao;
import com.whx.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    public void add(User user) {
        //获取session
        SqlSession session = null;
        try {
            session = SessionFactoryUtil.getSession();
            /*
             * 参数1：是我们执行的sql语句id
             * 参数2：如果方法是带参的  需要执行这个参数
             * 注意点：
             *    01.底层没有insert，delete 只有update
             *       001.点击insert观看源码
             *               新增操作
             *               public int insert(String statement, Object parameter) {
             return this.update(statement, parameter);
             }
             删除方法
             public int delete(String statement) {
             return this.update(statement, (Object)null);
             }
             002.最终执行的是update！你怎么知道我到达执行的是新增还是删除呢？？？点进去update
             001.根据mapper.xml文件中的sql语句！
             002.只有sql语句  就能更新到数据库吗？
             003.底层有一个属性叫dirty  是否是脏数据
             session.commit()执行的时候，会进行缓存清理和flush（）操作！
             缓存清理的时候会判断我们的对象是否是脏对象！如果是脏对象就会进行
             同步数据库的操作！之后再把dirty 属性变为false！
             *
             */
            session.insert("add", user);
            //手动提交事务
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //务必要关闭session
            session.close();
        }
    }

    public void addId(User user) {
        //获取session
        SqlSession session = null;
        try {
            session = SessionFactoryUtil.getSession();
            session.insert("addId", user);
            //手动提交事务
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //务必要关闭session
            session.close();
        }
    }

    public void delete(Serializable id) {
        //获取session
        SqlSession session = null;
        try {
            session = SessionFactoryUtil.getSession();
            session.delete("delete", id);
            //手动提交事务
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //务必要关闭session
            session.close();
        }
    }

    public void update(User user) {
        //获取session
        SqlSession session = null;
        try {
            session = SessionFactoryUtil.getSession();
            session.delete("update", user);
            //手动提交事务
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //务必要关闭session
            session.close();
        }
    }

    public List<User> findAll() {
        //获取session
        SqlSession session = null;
        List<User> user=null;
        try {
            session = SessionFactoryUtil.getSession();
            //查询所有操作
            user=session.selectList("findAll");
            //手动提交事务
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //务必要关闭session
            session.close();
        }
        return user;
    }

    /**
     * 查询所有 返回map集合
     */
   public Map<String ,Object> findAllByMap(){
       //获取session
       SqlSession session = null;
       Map<String ,Object> user=null;
       try {
           session = SessionFactoryUtil.getSession();
           /**
            *  查询所有操作 返回map
            *     s1: map集合中的key
            */
           user=session.selectMap("findAllByMap","loginName");
           //手动提交事务
           session.commit();
       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           //务必要关闭session
           session.close();
       }
       return user;
   }

    /**
     * 查询指定的user 返回User对象
     */
    public User findById(Serializable id){
        //获取session
        SqlSession session = null;
        User user=null;
        try {
            session = SessionFactoryUtil.getSession();
            user=session.selectOne("findById",id);
            //手动提交事务
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //务必要关闭session
            session.close();
        }
        return user;
    }

    /**
     * 根据姓名模糊查询
     */
   public List<User> findByName(String name){
       //获取session
       SqlSession session = null;
       List<User> user=null;
       try {
           session = SessionFactoryUtil.getSession();
           //查询所有操作
           user=session.selectList("findByName",name);
           //手动提交事务
           session.commit();
       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           //务必要关闭session
           session.close();
       }
       return user;
   }
}
