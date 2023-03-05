package com.ggyu.clientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ggyu.base", "com.ggyu.clientapp"})
public class GgyuClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GgyuClientApplication.class, args);
	}

}
