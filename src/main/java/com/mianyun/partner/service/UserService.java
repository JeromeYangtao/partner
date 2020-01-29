package com.mianyun.partner.service;

import com.mianyun.partner.domain.User;
import com.mianyun.partner.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author taoyang
 * @Date 2020/1/29
 **/

@Service
public class UserService {

    private UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    public List<User> findAllUser() {
        return this.userMapper.selectAll();
    }

    public User findUserById(int id) {
        return this.userMapper.selectById(id);
    }

    public void addUser(User user) {
        this.userMapper.insert(user);
    }

    public void updateUser(User user, int id) {
        this.userMapper.update(id, user.getName(), user.getAge(), user.getPhoneNumber(), user.getEmail());
    }

    public void deleteById(int id) {
        this.userMapper.deleteById(id);
    }
}
