package com.amuzhou.spring.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaZoneApplication {
  public static void main(String[] args) {
    SpringApplication.run(EurekaZoneApplication.class, args);
  }
}
