package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
		//Creating obj with Dependency Injection
		/*Here run itself returns the Application context obj that's why
		  we are giving Application context as an assignee. And as we need to call the Dev class
		  to implement the code, we need to Instantiate it. But assign it with the context
		  It creates a bean of the de class and calls for the method
		 */
		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
