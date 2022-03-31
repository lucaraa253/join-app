package com.training.selenium_basics;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\lucar\\Downloads\\chromedriver\\chromedriver.exe");
    	ChromeDriver driver = new ChromeDriver();
    	//driver.get("http://www.google.com");
    	
    	System.setProperty("webdriver.edge.driver", "C:\\Users\\lucar\\Downloads\\edgedriver\\edgedriver.exe");
    	driver.get("http://www.google.com");
    }
}
