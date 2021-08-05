package Selenium_day3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pongHomework1 {
	
	
	
WebDriver driver;
	
	@Before
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void test() throws InterruptedException {
		//input email address
		driver.findElement(By.id("email")).sendKeys("1@2.3");
		
		//clicks on submit button
		
		WebElement submitArrowButton = driver.findElement(By.id("enterimg"));
		
		submitArrowButton.click();
		
		//driver.findElement(By.id("enterimg")).click();
		//navigate to registration form
		//fill all information
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Pong");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Prin");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("25506 Feltre Ter, Chantilly VA 20152");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("Pong@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("7033329609");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		driver.findElement(By.id("checkbox2")).click();
		//select language
		driver.findElement(By.id("msdd")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[8]/label")).click();
		//select skill
		driver.findElement(By.id("Skills")).click();
		driver.findElement(By.xpath("//*[@id=\"Skills\"]/option[39]")).click();
		Thread.sleep(1000);
		//country
		driver.findElement(By.id("countries")).click();
		driver.findElement(By.xpath("//*[@id=\"countries\"]/option[226]")).click();
		Thread.sleep(1000);
		//select country
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"country\"]/option[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[8]/label")).click();
		//DOB
		driver.findElement(By.xpath("//*[@id=\"yearbox\"]/option[86]")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[10]")).click();
		driver.findElement(By.xpath("//*[@id=\"daybox\"]/option[19]")).click();
		//PW
		driver.findElement(By.id("firstpassword")).sendKeys("55IDontKnow");
		driver.findElement(By.id("secondpassword")).sendKeys("55IDontKnow");
		//submit
		driver.findElement(By.id("submitbtn")).click();
	}
	
	@After
	public void afterMethod() {
		
	}
	
	
	
	
	
	
	
	

}
