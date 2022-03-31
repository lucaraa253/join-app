package com.traingin.singleton;



public class Payment {

	
	public Payment() {
		System.out.println("Payment object created");
	}
	
	public void pay(int amount, String creditor) {
		System.out.println("USD " + amount + " paid successfully to : " + creditor);
	}
}
