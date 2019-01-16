package com.example.eurekaserver;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 2018/6/25.
 */
@FeignClient(name = "demo1",fallback = DemoFeignFallback.class)
public interface DemoFeignService {

    @GetMapping(value="/hello/1")
    String helloService();
}
