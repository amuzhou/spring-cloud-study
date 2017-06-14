package com.amuzhou.spring.cloud.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * 这边的@RefreshScope注解不能少，否则即使调用/refresh，配置也不会刷新
 * @author eacdy
 */
@RestController
@RefreshScope
public class ClientController {

    @Value("${serviceName}")
    private String       serviceName;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        Map<String, Object> parMap = new HashMap<String, Object>();
        parMap.put("a", a);
        parMap.put("b", b);
        return (Integer)restTemplate.getForEntity(serviceName+"/add?a=10&b=20", Integer.class).getBody();
        //需要修改restTemplate
//        return (Integer) restTemplate.postForObject(serviceName + "/add", parMap, Integer.class);
    }
}
