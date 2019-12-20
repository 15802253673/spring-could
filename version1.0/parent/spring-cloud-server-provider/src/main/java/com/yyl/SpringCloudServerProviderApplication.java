package com.yyl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudServerProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServerProviderApplication.class, args);
	}

}
