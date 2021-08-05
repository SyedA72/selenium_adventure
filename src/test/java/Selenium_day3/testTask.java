package Selenium_day3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testTask {

//	1) Open the browser
//	2) Enter the URL “http://practice.automationtesting.in/”
//	3) Click on My Account Menu
//	Register if do not have username/password
//	4) Enter registered username in username textbox
//	5) Enter password in password textbox
//	6) Click on login button
//	7) User must successfully login to the web page

	WebDriver driver;
	

	@Before
	public void beforeMethod() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
	}

	@Test
	public void pongTest() throws InterruptedException {
		Thread.sleep(3000);
		
			
//		if(driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]")).isDisplayed()) {
//			driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]")).click();
//		}else {
//			System.out.println("ad didn't show up");
//		}
//		
		
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-50\"]/a")).click();
		driver.findElement(By.id("username")).sendKeys("pong@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Saitthapong");
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
		//logout
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/p[1]/a")).click();
		
		
		
		WebElement LoginText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/h2"));
		
		
		if(LoginText.isDisplayed()) {
			System.out.println("test pass");
		}else {
			System.out.println("test failed");

		}
	}
	
	
//	@Test
//	public void FarhadTest() throws InterruptedException {
//		Thread.sleep(3000);
//		
//		
//
////		if(driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]")).isDisplayed()) {
////			driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]")).click();
////		}else {
////			System.out.println("ad didn't show up");
////		}
////		
//		
//		driver.findElement(By.id("menu-item-50")).click();
//		
//		driver.findElement(By.id("reg_email")).sendKeys("uyghur@gmail.com");
//		driver.findElement(By.id("reg_password")).sendKeys("Abc123");
//		driver.findElement(By.id("username")).sendKeys("uyghur@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Abc123");
//		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
//		
//	} 

	@After
	public void afterTest() {

	}

}
