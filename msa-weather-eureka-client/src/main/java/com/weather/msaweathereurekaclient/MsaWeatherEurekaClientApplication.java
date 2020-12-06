package com.weather.msaweathereurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsaWeatherEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaWeatherEurekaClientApplication.class, args);
	}

}
