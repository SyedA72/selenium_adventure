package Selenium_Day8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class homeworkTask {

	WebDriver driver;
	WebDriverWait wait;
	Actions action;

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
	public void test1() throws InterruptedException {
		wait = new WebDriverWait(driver, 30);

		// dresses button to navigate on to the page
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();

		// wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//*[@id=\"center_column\"]/ul/li"))));

		// storing all the dresses column into a list<webElement>
		// String xpath = "//*[@id=\"center_column\"]/ul/li";

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		List<WebElement> dresses = driver.findElements(By.xpath("//*[@id=\"center_column\"]/ul/li"));
//		List<WebElement> dressImages = driver.findElements(By.xpath("//*[@id=\"center_column\"]/ul/li[5]/div[1]/div[1]"))

//		System.out.println(dresses.size());

		for (int i = 0; i < dresses.size(); i++) {

			System.out.println("DRESS # == " + i + "--------- " + dresses.get(i).getText());

		
			
			
			if (dresses.get(i).getText().contains("%")) {
				
				int number = i+1;
				System.out.println(number);

				action.moveToElement(
						driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li" + "[" + number + "]/div[1]/div[1]")))
						.build().perform();

				WebElement addTocartButton = driver.findElement(
						By.xpath("//*[@id=\"center_column\"]/ul/li" + "[" + number + "]/div/div[2]/div[2]/a[1]"));
				// *[@id="center_column"]/ul/li[1]/div/div[2]/div[2]/a[1]

				wait.until(ExpectedConditions.elementToBeClickable(addTocartButton));

				addTocartButton.click();

			}

		}

	}

	@Ignore
	@Test
	public void Test1() throws InterruptedException {
		// click on Dress Tab
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();

		// Scroll by 1000 pixel vertically
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// This will scroll down the page by 1000 pixel vertical
		js.executeScript("window.scrollBy(0,1000)");

		// hover over 'in Stock' text
		WebElement itemPicture = driver
				.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/span/span"));

		action = new Actions(driver);

		action.moveToElement(itemPicture).build().perform();

		Thread.sleep(5000);

		// once the 'Add to Cart' button apears, click on it
		WebElement addToCartButton = driver
				.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span"));

		addToCartButton.click();

		WebElement greenCheckOutButton = driver
				.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));

		wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(greenCheckOutButton));

		greenCheckOutButton.click();

		// second green checkout button
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();

		/// verify if i am on 'authentication' page

		String authentication = driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/span[2]")).getText();

		Assert.assertEquals("Authentication", authentication);

	}

}
