package com.mianyun.partner.mapper;

import com.mianyun.partner.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    List<User> selectAll();

    User selectById(int id);

    void insert(User user);

    void deleteById(int id);

    void update(@Param("id") int id, @Param("name") String name, @Param("age") int age, @Param("phoneNumber") String phoneNumber, @Param("email") String email);

}


