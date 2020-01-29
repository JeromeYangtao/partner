package com.mianyun.partner.domain;

import lombok.Data;

@Data
public class User {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private int age;
    private String phoneNumber;
    private String email;
}
