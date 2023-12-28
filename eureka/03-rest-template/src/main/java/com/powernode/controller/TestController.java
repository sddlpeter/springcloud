package com.powernode.controller;

import com.powernode.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("testGet")
    public String get(String name) {
        System.out.println(name);
        return "ok";
    }

    @PostMapping("testPost1")
    public String testPost1(@RequestBody User user) {
        System.out.println(user);
        return "ok";
    }

    @PostMapping("testPost2")
    public String testPost2(User user) {
        System.out.println(user);
        return "ok";
    }

}
