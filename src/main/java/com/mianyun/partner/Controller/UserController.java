package com.mianyun.partner.Controller;

import com.mianyun.partner.Entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping("/api")
public class UserController {

    private List<User> userList = new ArrayList<>();

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getUserList() {
        return ResponseEntity.ok((userList));
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id) {
        User user = userList.get(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/user")
    public HttpStatus addUser(@RequestBody User user) {
        userList.add(user);
        return HttpStatus.OK;
    }

    @PutMapping("/user/{id}")
    public HttpStatus updateUser(@RequestBody User user, @PathVariable int id) {
        userList.remove(id);
        userList.add(user);
        return HttpStatus.OK;
    }

    @DeleteMapping("/user/{id}")
    public HttpStatus deleteUser(@PathVariable Long id) {
        userList.remove(id);
        return HttpStatus.OK;
    }
}
