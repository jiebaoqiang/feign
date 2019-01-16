package com.example.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EurekaServerApplication {


	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
		//new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
	}
}
