package com.kumar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaDiscoveryServerDay2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoveryServerDay2Application.class, args);
	}

}
