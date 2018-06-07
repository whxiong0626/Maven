package com.whx.service.impl;

import com.whx.bean.User;
import com.whx.dao.UserMapper;
import com.whx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String userName, String password){
       return userMapper.login(userName, password);
    }

}
