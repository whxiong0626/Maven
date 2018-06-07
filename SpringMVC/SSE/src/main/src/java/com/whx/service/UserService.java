package com.whx.service;

import com.whx.bean.User;

public interface UserService {
    User login(String userName,String password);
}
