package Selenium_Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBroswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\techc\\Documents\\Batches\\7\\workspace\\introToSelenium_Batch7\\driver\\chromedriver.exe");  
		
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriverManager.edgedriver().setup();
//		WebDriverManager.operadriver().setup();
//		WebDriverManager.phantomjs().setup();
//		WebDriverManager.iedriver().setup();
//		WebDriverManager.chromiumdriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		
		
//		driver.getTitle();
//		driver.getCurrentUrl();
//		driver.getPageSource();
		
		System.out.println("driver.getTitle() : "+ driver.getTitle());
		
		System.out.println("driver.getCurrentUrl():  "+ driver.getCurrentUrl());
		
//		System.out.println("driver.getPageSource() : "+driver.getPageSource());
		
		
		
		
		
		

	}

}
