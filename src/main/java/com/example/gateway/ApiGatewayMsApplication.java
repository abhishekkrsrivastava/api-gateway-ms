package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayMsApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApiGatewayMsApplication.class, args);

		//print the url coming
	}
//	@Bean
//	public HttpClient httpClient() {
//		return HttpClient.create().resolver(DefaultAddressResolverGroup.INSTANCE);
//	}
}
