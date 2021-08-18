package Selenium_day6;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionClassTasks {
	
	
	WebDriver driver;
	Actions action;

	@Before
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
	
		action = new Actions(driver);
		
		WebElement accountAndListMenu = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
		
		
		//this should hover over the menu
		action.moveToElement(accountAndListMenu).build().perform();
		
		
		
		
		
	
	}
	
	
	
	
	
	
	

}
