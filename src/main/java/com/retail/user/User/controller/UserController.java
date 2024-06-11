package com.retail.user.User.controller;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;
//
//    @Autowired
//    DiscoveryClient discoveryClient;
//
//    @Value("${eureka.client.service-url.defaultZone}")
//    private String serviceUrl;

}
