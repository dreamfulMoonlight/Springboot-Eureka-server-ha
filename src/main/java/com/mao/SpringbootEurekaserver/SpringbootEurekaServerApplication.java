package com.mao.SpringbootEurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaServer
public class SpringbootEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEurekaServerApplication.class, args);
	}
}
