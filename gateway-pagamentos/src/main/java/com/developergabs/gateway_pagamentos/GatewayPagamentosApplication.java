package com.developergabs.gateway_pagamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
public class GatewayPagamentosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayPagamentosApplication.class, args);
	}

}
