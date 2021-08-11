package Selenium_day4;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertions_testing {

	WebDriver driver;

	@Before
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

	@Ignore
	@Test
	public void AssertEqualTest() {

		String actualTitleOfThePage = driver.getTitle();
		String expectedTitleOfThePage = "Goog";

//		if (actualTitleOfThePage.equals(expectedTitleOfThePage)) {
//			System.out.println("Correct");
//		}

		Assert.assertEquals(expectedTitleOfThePage, actualTitleOfThePage);

	}

	@Test
	public void assertFalseTest() {
		driver.get("http://demo.guru99.com/test/radio.html");

//		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/input[5]")).click();
//
//		
//		//makes sure this radiobutton is not selected
//		Assert.assertFalse(driver.findElement(By.xpath("/html/body/div[2]/input[1]")).isSelected());  
//		//makes sure this radiobutton is selected
//		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/input[2]")).isSelected()); 	
//		//makes sure this radiobutton is not selected
//		Assert.assertFalse(driver.findElement(By.xpath("/html/body/div[2]/input[3]")).isSelected()); 
//		//makes sure this checkbox is not selected
//		Assert.assertFalse(driver.findElement(By.xpath("/html/body/div[2]/input[4]")).isSelected()); 
//		//makes sure this checkbox is selected
//		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/input[5]")).isSelected()); 	
//		//makes sure this checkbox is not selected
//		Assert.assertFalse(driver.findElement(By.xpath("/html/body/div[2]/input[6]")).isSelected()); 
		
		
		
		//list
		
		List<WebElement> listOfButtons = driver.findElements(By.xpath("/html/body/div[2]/input"));
		
		
		for (int i = 0; i < listOfButtons.size(); i++) {
			
		
			Assert.assertFalse(listOfButtons.get(i).isSelected()); 
			
			
			
		}
		
		
		
	}

	@Ignore
	@Test
	public void assertTrueTest() {

	}

	@After
	public void afterTest() {
	//	driver.close();
	}

}
