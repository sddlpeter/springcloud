package com.powernode;

import com.powernode.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {

        // 在java代码中，发送一个请求
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://www.google.com";
        String forObject = restTemplate.getForObject(url, String.class);
        System.out.println(forObject);
    }

    @Test
    void testGet() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/testGet?name=peter";
        //String result = restTemplate.getForObject(url, String.class);
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        System.out.println(responseEntity);
    }

    @Test
    void testPost1() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/testPost1";
        User peter = new User("peter", 22, 10000D);

        // 发送post，而且是json参数，因为web里面默认是jackson，它会把对象转换为json字符串
        String result = restTemplate.postForObject(url, peter, String.class);
        System.out.println(result);

    }

    @Test
    void testPost2() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/testPost2";
        // 构建一个表单参数
        LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
        map.add("name", "Peter");
        map.add("age", 26);
        map.add("price", 1000D);
        String result = restTemplate.postForObject(url, map, String.class);
        System.out.println(result);
    }

}
