package com.training.jwa.first_maven_project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
        System.out.println( "Welcome to my Maven Project" );
        
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded welcome to maven");
    }
}
