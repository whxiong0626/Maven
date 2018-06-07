package com.whx.dao;

import com.whx.bean.Student;
import com.whx.service.StudentService;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao {
    @Override
    public void add(Student student) {
        String sql="insert into student(sname,age) value(?,?)";
        getJdbcTemplate().update(sql, student.getSname(), student.getAge());
    }

    @Override
    public void del(Serializable id) {
        String sql="delete from student where sid=?";
        getJdbcTemplate().update(sql,id);
    }

    @Override
    public void update(Student student) {
        String sql="update student set sname=?,age=? where sid=?";
        getJdbcTemplate().update(sql,student.getSname(),student.getAge(),student.getId());
    }

    @Override
    public List<Student> getAll() {
        String sql="select * from student";
        return getJdbcTemplate().query(sql, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                Student student=new Student();
                student.setId(resultSet.getInt("sid"));
                student.setSname(resultSet.getString("sname"));
                student.setAge(resultSet.getInt("age"));
                return student;
            }
        });
    }
}
