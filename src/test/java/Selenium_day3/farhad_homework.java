package Selenium_day3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class farhad_homework {

	WebDriver driver;

	@Before
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
	}

	@Test
	public void Test() {

		// email block and takes to next page;
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("enterimg")).click();

		// first and last name;
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Uyghur");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Wolf");

		// address;
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"))
				.sendKeys("Adelaide,Australia");

		// email address
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("UyghurWolf@gmail.com");

		// phone
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("123456");

		// gender
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();

		// hobbies
		driver.findElement(By.id("checkbox2")).click();

		// languages
//		driver.findElement(By.id("msdd")).sendKeys("Uyghur");
		// *******Can't type in the box**********

		// skills
		driver.findElement(By.id("Skills")).sendKeys("Linux");

		// country
		driver.findElement(By.id("countries")).sendKeys("AUS");

		// DOB
		driver.findElement(By.id("yearbox")).sendKeys("2002");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")).sendKeys("May");
		driver.findElement(By.id("daybox")).sendKeys("23");

		// password
		driver.findElement(By.id("firstpassword")).sendKeys("askme1234");

		// confirm password
		driver.findElement(By.xpath(" //*[@id=\"secondpassword\"]")).sendKeys("askme1234");

		// submit button
		driver.findElement(By.id("submitbtn")).click();

		// refresh button
	//	driver.findElement(By.id("Button1")).click();
		

	}

	@After
	public void afterMethod() {
	}

}
