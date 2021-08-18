package Selenium_Day8;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitTasks {
	
	
	
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, 30);

	@Before
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver",	System.getProperty("User" + "eclipse-workspace\\IntroToSelenium_Batch7\\src\\test\\resources\\driver\\chromedriver.exe"));
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void test() {
		
		//click on dresses tab, and it navigates to dresses page
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
		
		WebElement casualDressButton = driver.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img"));
		
		
		wait.until(ExpectedConditions.elementToBeClickable(casualDressButton));
		
		casualDressButton.click();
		
		///    //*[@id="subcategories"]/ul/li[1]/div[1]/a/img
		
		////  guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
		
		
		Wait wait = new FluentWait(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(Exception.class);
		
		
		
		
	}
	
	

}
