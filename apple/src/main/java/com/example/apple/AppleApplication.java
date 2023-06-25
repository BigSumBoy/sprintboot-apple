package com.example.apple;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.apple.mapper")
public class AppleApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(AppleApplication.class, args)
		;
	}

}
