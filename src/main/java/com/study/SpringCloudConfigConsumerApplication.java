package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class SpringCloudConfigConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigConsumerApplication.class, args);
	}
	
}
