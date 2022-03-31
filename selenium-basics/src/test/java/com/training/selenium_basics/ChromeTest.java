package com.training.selenium_basics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest {
	String browserName = "chrome";
	
	WebDriver driver;
	
	@BeforeEach
	public void setUp() {
		if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
			
	}
	
	@Test
	public void testGoogle() {
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("mobiles");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);

	}
	
	@Test
	public void testAmazonSearchFunctionality() {
		
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
	}
	
	@AfterEach
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
