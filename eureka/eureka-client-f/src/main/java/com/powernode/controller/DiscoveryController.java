package com.powernode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DiscoveryController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("test")
    public String doDiscovery(String serviceName) {
        // 这就是服务发现，通过服务名称，找到服务的具体信息
        List<ServiceInstance> instances = discoveryClient.getInstances(serviceName);

        instances.forEach(System.out::println);

        ServiceInstance serviceInstance = instances.get(0);
        String ip = serviceInstance.getHost();
        String host = serviceInstance.getHost();
        System.out.println(ip + " " + host);

        return instances.get(0).toString();

    }
}
