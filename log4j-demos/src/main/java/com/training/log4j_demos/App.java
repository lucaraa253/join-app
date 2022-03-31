package com.training.log4j_demos;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Please enter your name");
    	String name = scanner.next();
    	
        System.out.println( "Hello and Welcome!" );
        logger.info(name + " has logged in at " + new java.util.Date());
        logger.trace("Calling the trace");
        logger.debug("Calling the debug");
        logger.info("Calling the info");
        logger.warn("Calling the warn");
        logger.error("Calling the error");
        logger.fatal("Calling the fatal");
        System.out.println( "Thanks for using my program" );
    }
}
