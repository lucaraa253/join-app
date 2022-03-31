package com.training.jwa.jwa_product_app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
    	Class.forName("org.postgresql.Driver");
    	System.out.println("Postgres driver loaded");
        System.out.println( "Hello World!" );
        
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("SQL driver loaded");
    }
}
