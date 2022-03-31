package com.training.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringApp {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
//		Employee empl = (Employee) factory.getBean("emp");
////		empl.setEmployeeName("Mark");
//		System.out.println(empl.getEmployeeName());
//		
//		Employee emp2 = (Employee) factory.getBean("emp1");
////		emp2.setEmployeeName("Kaylin");
//		System.out.println(emp2.getEmployeeName());
//		
//		Customer cust = (Customer)factory.getBean("cust");
//		System.out.println(cust.getCustomerName());
//		
//		Address ad1 = (Address)factory.getBean("address1");
//		System.out.println(ad1.getZipCode());
//		
//		Address ad2 = (Address)factory.getBean("address2");
//		System.out.println(ad2.getState());
		
//		Email email1 = (Email)factory.getBean("newEmail");
		Email email2 = (Email)factory.getBean("email");
		System.out.println(email2);

	}

}
