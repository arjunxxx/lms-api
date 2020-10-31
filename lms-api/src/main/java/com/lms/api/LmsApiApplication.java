package com.lms.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages= {"com.lms.api"})
@EnableSwagger2
public class LmsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmsApiApplication.class, args);
	}

}
