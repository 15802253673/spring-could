package com.yyl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableEurekaClient //绑定Eureka
@EnableDiscoveryClient //可绑定自己的实现
@RibbonClients({@RibbonClient(name="spring-cloud-server-provider")})
public class SpringCloudEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClientApplication.class, args);
	}


	@Bean //声明 RestTemplate
	@LoadBalanced // RestTemplate 的行为变化
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
