package com.amuzhou.spring.cloud.study.controller;

import com.amuzhou.spring.cloud.study.service.EurekaService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoumeng750
 * @ClassName: EurekaController
 * @Description:
 * @date 17/6/14
 */
@RestController
public class EurekaController {

    private final Logger    logger = Logger.getLogger(getClass());

    @Autowired
    private EurekaService   eurekaService;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/add", method = { RequestMethod.GET, RequestMethod.POST })
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer result = eurekaService.add(a, b);
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:"
                    + result);
        return result;
    }
}
