package com.alom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GreatingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreatingServiceApplication.class, args);
	}

}
