package com.kumar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientProducerDay2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientProducerDay2Application.class, args);
	}

}
