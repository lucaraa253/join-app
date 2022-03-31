package com.training.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.training.spring.Address;
import com.training.spring.Customer;

@Configuration
public class AppConfig {
		
	
	@Bean
	public Address getAddress() {
		return new Address();
	}
	
	@Bean
	@Scope(value="prototype")
	public Customer getCustomer() {
		return new Customer();
	}
}
