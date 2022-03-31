package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int balance;
	//dependant object
	@Autowired
	private Address address;
	
	public Customer() {
		System.out.println("Default constr called");
	}
	
	public Customer(int customerId, String customerName, String customerAddress, int balance, Address address) {
		
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.balance = balance;
		this.address = address;
		System.out.println("param constr called");
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", balance=" + balance + ", address=" + address + "]";
	}
	
	
}
