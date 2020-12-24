package com.example.springsecuritydemo.Test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {
    public static void main(String[] args) {
        BCryptPasswordEncoder en = new BCryptPasswordEncoder();
        System.out.println(en.encode("123"));;
    }
}
