package Selenium_day2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day2_junit_WebTesting {

	WebDriver driver;

	@Before
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
	}

	@Test
	public void Test1() {

		String titleOfThePage = driver.getTitle();

		System.out.println(titleOfThePage);
		
//		
		driver.navigate().to("https://www.google.com");
		
		
		driver.navigate().back(); //gos back to youtube
		
		
		
		
//		driver.getCurrentUrl(); ///retrieves current url
//		
//		
//		
//		String pageSource = driver.getPageSource();
//		
//		
//		System.out.println(pageSource);
		
		
		
		
		
		
	}

	@After
	public void afterTest() {
		//driver.close();
	}

}
