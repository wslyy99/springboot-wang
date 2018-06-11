package com.springboot.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.Filter;

@SpringBootApplication
@ServletComponentScan
//启注解事务管理
@EnableTransactionManagement
@MapperScan("com.springboot.wang.dao")
public class SpringbootWangWebApplication {

	// 用于处理编码问题
	@Bean
	public Filter characterEncodingFilter() {
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);
		return characterEncodingFilter;
	}

	//文件下载
	@Bean
	public HttpMessageConverters restFileDownloadSupport() {
		ByteArrayHttpMessageConverter arrayHttpMessageConverter = new ByteArrayHttpMessageConverter();
		return new HttpMessageConverters(arrayHttpMessageConverter);
	}

	/*//tomcat打包war
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		logger.info("============应用启动了！！！=================");
		return application.sources(SpringbootWangWebApplication.class);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWangWebApplication.class, args);
	}
}
