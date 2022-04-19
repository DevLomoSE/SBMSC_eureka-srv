package com.devlomo.sbms.srv.eureka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsEurekaSrvApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEurekaSrvApplication.class, args);
	}

}
