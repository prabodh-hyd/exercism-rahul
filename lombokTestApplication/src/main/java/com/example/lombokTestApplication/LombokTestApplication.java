package com.example.lombokTestApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokTestApplication.class, args);
	   Users user =  new Users();
	   
	   user.setUserId(1);
	   user.setUserName("Rahul");
	   user.setRollnum(1);
	   
	
	  System.out.println(user);
     
	}

}
