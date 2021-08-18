package Selenium_day7;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframePractice {
	
	
	WebDriver driver;
	Actions action;

	@Before
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver",	System.getProperty("User" + "eclipse-workspace\\IntroToSelenium_Batch7\\src\\test\\resources\\driver\\chromedriver.exe"));
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void dragAndDrop() {
		
		// 
		action = new Actions(driver);
		
		driver.switchTo().frame(0);
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(draggable, target).build().perform();
		
		//switches out of the current frame onto either parent or onto main frame
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		// should click 'selectable' button on the left side of the page
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[4]/a")).click();
		
		
		
		
		
//		//switch to iframe by index
//		driver.switchTo().frame(0);
//		action = new Actions(driver);
//		//initiate WebElement to store drag and drop locator
//		WebElement drag = driver.findElement(By.id("draggable"));
//		WebElement drop = driver.findElement(By.id("droppable"));
//		//do drag drop
//		action.dragAndDrop(drag, drop).build().perform();
		
	}
	
	
	
	
	@After
	public void after() {
		
	}






}
