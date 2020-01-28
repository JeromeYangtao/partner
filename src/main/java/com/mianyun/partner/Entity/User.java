package com.mianyun.partner.Entity;

import lombok.Data;

/**
 * @Author taoyang
 * @Date 2020/1/27
 **/

@Data
public class User {
    private Long id;
    private String name;
    private String age;
    private String phoneNumber;
    private String email;
}
