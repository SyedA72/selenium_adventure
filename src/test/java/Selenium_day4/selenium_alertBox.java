package Selenium_day4;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium_alertBox {

	WebDriver driver;

	@Before
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void alerts1() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button")).click();

		Thread.sleep(2000);

		driver.switchTo().alert().accept();

		Thread.sleep(3000);

	}

	@Test
	public void alerts2() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();

		Thread.sleep(2000);

		// verifies the text inside the second alertbox
		String actualAlertMessage = driver.switchTo().alert().getText();
		String expectedAlertMessage = "Press a button!";

		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);

		driver.switchTo().alert().accept();

		Thread.sleep(1000);

		// verifying message after closing the second alert box
		String actualMessageOnTheSecondAlertPage = driver.findElement(By.xpath("//*[@id=\"confirm-demo\"]")).getText();
		String expectedMessageOnTheSecondAlertPage = "You pressed OK!";

		Assert.assertEquals(expectedMessageOnTheSecondAlertPage, actualMessageOnTheSecondAlertPage);

		Thread.sleep(3000);

	}

	@Test
	public void alerts3() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();

		Thread.sleep(2000);

		String myNameExpect = "Shafkat";

		driver.switchTo().alert().sendKeys(myNameExpect);

		driver.switchTo().alert().accept();

		Thread.sleep(1000);

		String visibleFullText = driver.findElement(By.xpath("//*[@id=\"prompt-demo\"]")).getText();

		visibleFullText = visibleFullText.substring(18, 25);

		System.out.println(visibleFullText);

		Assert.assertEquals(myNameExpect, visibleFullText);

	}

	@After
	public void afterTest() {
		driver.close();
	}

}
