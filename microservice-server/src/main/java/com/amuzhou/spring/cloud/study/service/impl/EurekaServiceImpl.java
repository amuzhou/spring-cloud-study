package com.amuzhou.spring.cloud.study.service.impl;

import com.amuzhou.spring.cloud.study.service.EurekaService;
import org.springframework.stereotype.Service;

/**
 * @author zhoumeng750
 * @ClassName: EurekaService
 * @Description:
 * @date 17/6/14
 */
@Service("eurekaService")
public class EurekaServiceImpl implements EurekaService {

    public Integer add(Integer a, Integer b){
        return a+b;
    }
}
