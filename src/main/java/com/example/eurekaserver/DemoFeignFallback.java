package com.example.eurekaserver;

import org.springframework.stereotype.Component;

/**
 * 2018/6/25.
 */
@Component
public class DemoFeignFallback implements DemoFeignService {
    @Override
    public String helloService() {
        return "error";
    }
}
