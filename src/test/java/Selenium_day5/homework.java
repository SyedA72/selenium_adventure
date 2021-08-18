package Selenium_day5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class homework {

	WebDriver driver;

	@Before
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		// enter username
		driver.findElement(By.id("txtUsername")).click();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		// enter password
		driver.findElement(By.id("txtPassword")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		// click log in button
		Thread.sleep(1000);
		driver.findElement(By.id("btnLogin")).click();

		// navigates to naionalities page
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_nationality")).click();

		String ourNationality = "Korla";

		// loop the nationalities
		List<WebElement> nationalities = driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]"));
		List<WebElement> nationalitiesCheckbox = driver
				.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[1]"));

		Boolean flag = false;

		for (int i = 0; i < nationalities.size(); i++) {

			System.out.println(nationalities.get(i).getText());

			Boolean nationExist = nationalities.get(i).getText().trim().contains(ourNationality);

			if (nationExist) {

				nationalitiesCheckbox.get(i).click();

				// clicks delete button
				driver.findElement(By.id("btnDelete")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("dialogDeleteBtn")).click();
				Thread.sleep(1000);

				driver.navigate().refresh();

				Thread.sleep(3000);

				List<WebElement> nationalitiesCheckIfDeleted = driver
						.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]"));

				nationExist = nationalitiesCheckIfDeleted.get(i).getText().trim().contains(ourNationality);

				Assert.assertFalse(nationExist);

			}

			if (!nationExist) {
				flag = true;
			}

		}
		if (flag) {

			// clicks add button
			driver.findElement(By.id("btnAdd")).click();
			// nation name inputbox
			driver.findElement(By.id("nationality_name")).sendKeys(ourNationality);
			// saves addition
			driver.findElement(By.id("btnSave")).click();

			driver.navigate().refresh();

			Thread.sleep(3000);

			for (int i = 0; i < nationalities.size(); i++) {

				List<WebElement> nationalitiesCheckIfAdded = driver
						.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]"));

				Boolean nationExist = nationalitiesCheckIfAdded.get(i).getText().trim().contains(ourNationality);

				if (nationExist) {
					System.out.println(" actual value on the page --> " + nationalitiesCheckIfAdded.get(i).getText());
					System.out.println(" the value we inputed --> " + ourNationality);

					System.out.println("if this prints true  then the next line will pass -->" + nationExist);

					Assert.assertTrue(nationExist);
				}

			}

		}

	}

}
