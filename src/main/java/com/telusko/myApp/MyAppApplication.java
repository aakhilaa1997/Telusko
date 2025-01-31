package com.telusko.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
		//Creating obj with Dependency Injection
		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
