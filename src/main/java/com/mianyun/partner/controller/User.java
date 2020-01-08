package com.mianyun.partner.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class User {

    @RequestMapping("")
    public ArrayList getUserList(){
        ArrayList<String> userList = new ArrayList<>();
        userList.add("测试用户");
        return userList;
    }
}
