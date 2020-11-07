package com.cloud.service.impl;

import com.cloud.dao.UserMapper;
import com.cloud.model.entity.User;
import com.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


public class UserServiceImpl implements UserService {

//    @Resource
//    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return null;
    }
}
