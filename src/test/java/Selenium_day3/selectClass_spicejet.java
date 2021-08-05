package Selenium_day3;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectClass_spicejet {

	WebDriver driver;
	Select select;

	@Before
	public void beforeMethod() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
	}

	@Ignore
	@Test
	public void staticDropDown() throws InterruptedException {
		
		select = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		
		select.selectByIndex(5);
		Thread.sleep(2000);
		select.selectByValue("GBP");
		Thread.sleep(2000);
		select.selectByVisibleText("AED");
		
		

	}
	
	
	@Test
	public void dynamicDropDown() throws InterruptedException {
		//click on the dropdown to open up the dropdown options
		Thread.sleep(3000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		//store the four columns into an arraylist
		
		Thread.sleep(3000);
		
		List<WebElement> dropdown1 = driver.findElements(By.xpath("(//*[@id=\"dropdownGroup1\"])[1]/div/ul/li"));
		
		
		for (int i = 0; i < dropdown1.size(); i++) {
			
//			System.out.println(dropdown1.get(i).getText());
			
			if(dropdown1.get(i).getText() == "Jaisalmer (JSA)") {
				dropdown1.get(i).click();
			}
			
			
			
		}
//		
		
		
		
	}

}
