package com.galvanize.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static int returnNumber(){
	 return 1;
	}

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}
}
