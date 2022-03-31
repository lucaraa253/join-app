package com.training.cucumber;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class GoogleSearchSteps {
	
	String browserName = "chrome";
	
	WebDriver driver;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("#Step - user opens the browser");
		if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if(browserName.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
				
	}


	@And("user is on home page")
	public void user_is_on_home_page() {
		System.out.println("Step - user is on log in page");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	} 
	
	@When("user enters the search criteria in the search bar")
	public void user_enters_the_search_criteria_in_the_search_bar() {
		System.out.println("Step - user searches item");
		driver.findElement(By.name("q")).sendKeys("mobiles");
		
	}

	@When("user clicks on the search button")
	public void user_clicks_on_the_search_button() {
		System.out.println("Step - user clicks on the search button");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to the display page of the searched item")
	public void user_is_navigated_to_the_display_page_of_the_searched_item() {
		System.out.println("Step - user is navigated to the display page");
		assertTrue(driver.findElement(By.id("searchform")).isDisplayed());
		
		driver.close();
		driver.quit();
	}
	
}
