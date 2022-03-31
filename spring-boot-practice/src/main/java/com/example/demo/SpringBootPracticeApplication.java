package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Customer;

@SpringBootApplication
public class SpringBootPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootPracticeApplication.class, args);
		String allBeans[] = context.getBeanDefinitionNames();
		
		Arrays.sort(allBeans);

		for(String temp:allBeans) {
			System.out.println(temp);
		}

		
	}
	@Bean
	public Customer getCustomer() {
		return new Customer();
	}
}
