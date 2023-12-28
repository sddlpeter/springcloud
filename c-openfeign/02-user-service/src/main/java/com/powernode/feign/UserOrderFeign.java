package com.powernode.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "order-service")
public interface UserOrderFeign {


    // 需要调用哪个方法，就写它的方法签名, 这里要调用doOrder方法
    @GetMapping("doOrder")
    String doOrder();
}
