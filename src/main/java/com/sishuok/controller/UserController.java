package com.sishuok.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sishuok.entity.User;

/**
 * 对象方式反悔串
 * <p>User: 
 * <p>Date: 13-12-22
 * <p>Version: 1.0
 */
@EnableAutoConfiguration
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{id}")
    private User view(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        user.setName("zhang");
        return user;
    }

 /*   public static void main(String[] args) {
        SpringApplication.run(UserController.class);
    }*/
}
