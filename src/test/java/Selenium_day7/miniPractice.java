package Selenium_day7;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class miniPractice {

	WebDriver driver;


	@Before
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver",	System.getProperty("User" + "eclipse-workspace\\IntroToSelenium_Batch7\\src\\test\\resources\\driver\\chromedriver.exe"));
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	@Test
	public void test() {
		
		driver.findElement(By.name("q")).sendKeys("TechCircle School" , Keys.ENTER);
		
		
		
		
		
	}
	
	

}
