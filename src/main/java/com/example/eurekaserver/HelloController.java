package com.example.eurekaserver;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 2018/5/10.
 */
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DemoFeignService demoFeignService;

    @GetMapping("/ribbon-consumer")
    public String index(){
        String s = demoFeignService.helloService();
        s = s+"ass";
        return s;

    }
}
