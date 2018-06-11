package com.springboot.wang.dubbo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SpringbootWangDubboClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWangDubboClientApplication.class, args);
	}
}
