package com.mianyun.partner.controller;

import com.mianyun.partner.domain.User;
import com.mianyun.partner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getUserList() {
        List<User> userList = userService.findAllUser();
        return ResponseEntity.ok((userList));
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id) {
        User user = userService.findUserById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/user")
    public HttpStatus addUser(@RequestBody User user) {
        userService.addUser(user);
        return HttpStatus.OK;
    }

    @PutMapping("/user/{id}")
    public HttpStatus updateUser(@RequestBody User user, @PathVariable int id) {
        userService.updateUser(user,id);
        return HttpStatus.OK;
    }

    @DeleteMapping("/user/{id}")
    public HttpStatus deleteUser(@PathVariable int id) {
        userService.deleteById(id);
        return HttpStatus.OK;
    }
}
