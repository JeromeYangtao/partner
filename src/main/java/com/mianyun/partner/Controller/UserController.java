package com.mianyun.partner.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
//@RequestMapping("/api")
public class UserController {

    @GetMapping(value = "/users")
    public ArrayList getUserList(){
        ArrayList<String> userList = new ArrayList<>();
        userList.add("测试用户");
        return userList;
    }

    @GetMapping(value = "/users/{id}")
    public ArrayList getUser(@PathVariable Long id){
        ArrayList<String> userList = new ArrayList<>();
        userList.add("测试用户" + id);
        return userList;
    }

    @PostMapping("/user")
    public ArrayList addUser(){
        ArrayList<String> userList = new ArrayList<>();
        userList.add("测试用户添加");
        return userList;
    }

    @PutMapping("/user/{id}")
    public ArrayList updateUser(@PathVariable Long id){
        ArrayList<String> userList = new ArrayList<>();
        userList.add("测试用户更新" + id);
        return userList;
    }

    @DeleteMapping("/user/{id}")
    public ArrayList deleteUser(@PathVariable Long id){
        ArrayList<String> userList = new ArrayList<>();
        userList.add("测试用户删除" + id);
        return userList;
    }
}
