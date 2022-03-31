package com.training.selenium_basics;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
	public void testSauceDemoFunctionality() {
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		//assert to check whether it is logged in or not
		//assertTrue(driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).isDisplayed());
				assertTrue(driver.findElement(By.id("inventory_container")).isDisplayed());
	}
	

	
	@AfterEach
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
