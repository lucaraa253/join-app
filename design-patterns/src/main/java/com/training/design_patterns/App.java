package com.training.design_patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        Payment tony = Payment.getPaymentObject();
        tony.pay(98000, "Tony");
        Payment amad = Payment.getPaymentObject();
        tony.pay(99000, "Amad");
        Payment kami = Payment.getPaymentObject();
        tony.pay(99000, "Kami");
    }
}
