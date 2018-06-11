package com.springboot.wang.dubbo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class SpringbootWangDubboServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWangDubboServerApplication.class, args);
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
