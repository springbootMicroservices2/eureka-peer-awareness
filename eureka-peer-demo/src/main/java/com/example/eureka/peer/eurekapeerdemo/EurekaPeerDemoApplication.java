package com.example.eureka.peer.eurekapeerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaPeerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaPeerDemoApplication.class, args);
	}

}
