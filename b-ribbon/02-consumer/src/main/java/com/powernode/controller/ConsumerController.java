package com.powernode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("testRibbon")
    public String testRibbon(String serviceName) {
        // 需要拿到ip port和路径才可以使用
        // http://provider/hello
        String result = restTemplate.getForObject("http://" + serviceName + "/hello", String.class);

        // 只要给restTemplate加了Ribbon注解，项目中这个对象发起的请求，都会走Ribbon的代理
        // 如果想使用原生的restTemplate，就需要重新创建一个对象
//        RestTemplate myRest = new RestTemplate();
//        myRest.getForObject("http://localhost:8888/aaa", String.class);
        return result;
    }
}
