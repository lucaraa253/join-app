package com.traingin.singleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        Payment tony = new Payment();
        tony.pay(98000, "Tony");
        Payment amad = new Payment();
        tony.pay(99000, "Amad");
        Payment kami = new Payment();
        tony.pay(99000, "Kami");
    }
}
