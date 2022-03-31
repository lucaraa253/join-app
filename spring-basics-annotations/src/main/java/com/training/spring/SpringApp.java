package com.training.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.training.spring.config.AppConfig;

public class SpringApp {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Address address = context.getBean(Address.class);
		Customer customer = context.getBean(Customer.class);
		
		address.setAddressId(1222);
		address.setCity("London");
		address.setState("UK");
		address.setZipCode(97856);
		
		customer.setCustomerId(23);
		customer.setCustomerName("Trevor");
		customer.setCustomerAddress("US");
		customer.setBalance(94000);
		
//		customer.setAddress(address);
		
		System.out.println(customer);
		System.out.println(customer);
		
	}

}
