package com.powernode.controller;

import com.powernode.feign.UserOrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@RestController
public class UserController {

    @Autowired
    private UserOrderFeign userOrderFeign;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("userDoOrder")
    public String userDoOrder() {
        System.out.println("有用户进来了");

        // 这里需要发起远程调用
        String result = userOrderFeign.doOrder();
        return result;
    }


    public static void main(String[] args) {


    }
}
