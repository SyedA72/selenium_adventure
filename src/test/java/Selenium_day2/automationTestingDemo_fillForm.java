package Selenium_day2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automationTestingDemo_fillForm {
	
	WebDriver driver;
	
	
	@Before
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
	}
	
	
	@Test
	public void Test() {
		
		//input my email address
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		
		//clicks on submit button
		driver.findElement(By.id("enterimg")).click();
		
		
		
		//navigates to form page
		
		//firstName
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("John");
		
		
	
		//lastName
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Doe");

		
		//input address
		
		
		
		//input email address
		
		
		
		//input phone number
		
		
		//select gender radio button
		
		
		
		
		//select hobbies checkbox
		
		
		
		//select languages
		
		
		
		//select skills
		
		
		
		// country
		
		
		
		
		//select country
		
		
		
		
		//date of birth
		
				//year
				//month
				//day
		
		
		
		
		//password
		
		
		
		//confirm password
		
		
		
		
		
		
		
		
	}
	
	
	@After
	public void afterMethod() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
