package Selenium_day7;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandlesTask {

	WebDriver driver;

	@Before
	public void beforeMethod() {
		WebDriverManager.firefoxdriver().setup();
//		System.setProperty("webdriver.chrome.driver",	System.getProperty("User" + "eclipse-workspace\\IntroToSelenium_Batch7\\src\\test\\resources\\driver\\chromedriver.exe"));
		driver = new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Ignore
	@Test
	public void window1() {

		// click on the tabButton
		driver.findElement(By.id("tabButton")).click();

		System.out.println("Title of the page before Switching WindowHandle -- >" + driver.getTitle());

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> itr = ids.iterator();

		String parentId = itr.next();
		String childId = itr.next();

		driver.switchTo().window(childId);

		System.out.println("Title of the page after Switching WindowHandle -- >" + driver.getTitle());

		// assert the message in the tab page
		Assert.assertEquals("This is a sample page", driver.findElement(By.id("sampleHeading")).getText());

		driver.switchTo().window(parentId);

		System.out.println("Title of the page after Switching back to Parent Window -- >" + driver.getTitle());

	}

	@Ignore
	@Test
	public void window2() {

		driver.findElement(By.id("windowButton")).click();

		System.out.println("Test 2: Title of the page before switching windowHandle --> " + driver.getTitle());

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> itr = ids.iterator();

		String parentId = itr.next();
		String childId = itr.next();

		driver.switchTo().window(childId);

		System.out.println("Test 2: Title of the page after switching windowHandle --> " + driver.getTitle());

		Assert.assertEquals("This is a sample page", driver.findElement(By.id("sampleHeading")).getText());

		driver.switchTo().window(parentId);

		System.out.println("Test 2: Title of the page after switching back windowHandle --> " + driver.getTitle());
	}

	
	@Test
	public void window3() throws InterruptedException {

		driver.findElement(By.id("messageWindowButton")).click();
		
		Thread.sleep(3000);

		System.out.println("Test 3: Title of the page before switching windowHandle --> " + driver.getTitle());

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> itr = ids.iterator();

		String parentId = itr.next();
		String childId = itr.next();

		driver.switchTo().window(childId);

		System.out.println("Test 3: Title of the page after switching windowHandle --> " + driver.getTitle());

		Assert.assertEquals(
				"Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.",
				driver.findElement(By.xpath("//html/body")).getText());

		driver.switchTo().window(parentId);

		System.out.println("Test 3: Title of the page after switching back windowHandle --> " + driver.getTitle());

	}

}
