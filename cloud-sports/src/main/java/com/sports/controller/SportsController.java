package com.sports.controller;

import com.cloud.model.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sport")
public class SportsController {


    @GetMapping("/get")
    public String get(){
        return  "sports";
    }

    @GetMapping("/getUser")
    public List<User> getUser(){

        return null;
    }
}
