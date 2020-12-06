package com.weather.msaweathereurekazuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class MsaWeatherEurekaZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaWeatherEurekaZuulApplication.class, args);
	}

}
