package com.ggyu.clientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.ggyu.base")
@SpringBootApplication(scanBasePackages = "com.ggyu.base")
public class GgyuClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GgyuClientApplication.class, args);
	}

}
