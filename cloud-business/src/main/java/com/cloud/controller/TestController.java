package com.cloud.controller;

import cn.hutool.json.JSONObject;
import com.cloud.dao.UserMapper;
import com.cloud.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserMapper userMapper;


    @GetMapping("/getUser")
    public List<User> getUser(){
        return userMapper.selectAll();
    }

    @GetMapping("/get")
    public List<Map<String,Object>> get(){

        Map map = new HashMap(){
            {
                put("name","张三");
            }
        };
        List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();
        list.add(map);
        return list;
    }


}
