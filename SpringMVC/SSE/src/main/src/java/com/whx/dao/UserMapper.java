package com.whx.dao;

import com.whx.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User login(String userName,String password);
}
