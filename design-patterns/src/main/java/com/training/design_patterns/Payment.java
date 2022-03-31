package com.training.design_patterns;



public class Payment {
	
	//created a payment object that is set to null
	private static Payment payment = null;
	
	//bean sonstructor will not be called when asked upon by the app.java
	public Payment() {
		System.out.println("Payment object created");
	}
	//This created a payment object that you can use without actually instantiating a new object
	public static Payment getPaymentObject(){
		
		if(payment==null) {
			payment=new Payment();
		}
		return payment;
	}
	
	public void pay(int amount, String creditor) {
		System.out.println("USD " + amount + " paid successfully to : " + creditor);
	}
}
