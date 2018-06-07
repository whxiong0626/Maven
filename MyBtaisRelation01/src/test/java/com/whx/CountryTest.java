package com.whx;

import com.whx.bean.*;
import com.whx.dao.*;
import com.whx.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class CountryTest {
    CountryDao dao=null;
    Country01Dao dao01=null;
    TeacherDao dao02=null;
    Teacher01Dao dao03=null;
    Teacher03Dao dao04=null;
    SqlSession sqlSession=null;
    Logger logger=Logger.getLogger(CountryTest.class);

    /**
     * 在所有的test测试方法执行之前 都要执行的操作
     */
    @Before
    public void before(){
        //获取session
        sqlSession= SessionFactoryUtil.getsession();
        dao=sqlSession.getMapper(CountryDao.class);
        dao01=sqlSession.getMapper(Country01Dao.class);
        dao02=sqlSession.getMapper(TeacherDao.class);
        dao03=sqlSession.getMapper(Teacher01Dao.class);
        dao04=sqlSession.getMapper(Teacher03Dao.class);

    }
    @After
    public void after(){
        if (sqlSession!=null){
            sqlSession.close();
        }
    }

    /**
     * 关联映射一对多
     */
    @Test
    public void testselectCountryById(){
        Country country=dao.selectCountryById(1);
        logger.debug(country);
    }

    /**
     * 关联映射一对多
     * 延迟加载
     */
    @Test
    public void testselectCountryById01(){
        Country country=dao.selectCountryById(2);
        logger.debug(country.getCname());
        logger.debug(country.getProvincials());
    }

    /**
     * 关联映射多对一
     */
    @Test
    public void test(){
        Provincial01 provincial=dao01.selectProvincialById(2);
        logger.debug(provincial.getPname());
        logger.debug(provincial.getCountry().getCname());
    }

    /**
     * 自动连接一对多
     */
    @Test
    public  void  testSelectByTid(){
        List<Teacher> teachers = dao02.selectTeachersByTid(1);
        logger.debug(teachers);  //会把查询结果id当成tid再次查询
        // log.debug(teachers.get(0).getName()); //不会触发 只查询 tid为1的数据
    }

    @Test
    public  void  testSelectById(){
        Teacher teacher= dao02.selectByTeacherId(3);
        //  log.debug(teacher.getName()); //1条sql
        logger.debug(teacher);
    }

    /**
     * 自动连接多对一
     */
    @Test
    public  void  testSelectByTid01(){
        Teacher01 teacher = dao03.findTeachersById(7);
        logger.debug(teacher);
    }
    /**
     * 多对多查询
     */
    @Test
    public  void  testSelectBySid03(){
        Student03 student = dao04.selectTeachersBySid(2);
        logger.debug(student);
    }

    @Test
    public  void  testSelectByTid03(){
        Teacher03 teacher = dao04.selectStudentsByTid(1);
        logger.debug(teacher);
    }

}
