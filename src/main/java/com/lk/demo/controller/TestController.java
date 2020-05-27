package com.lk.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lk.demo.ds.entity.User;

@RestController
public class TestController {
	@RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
	@RequestMapping("/getUser")
    public User getUser() {
    	User user=new User();
    	user.setUserName("小明");
    	user.setPassWord("xxxx");
        return user;
    }
}
