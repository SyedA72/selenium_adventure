package saturdayReview;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MortgageCalculator {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
		
		WebElement homeValue = driver.findElement(By.id("homeval"));
		WebElement downPayment = driver.findElement(By.id("downpayment"));
		WebElement loanAmount = driver.findElement(By.id("loanamt"));
		WebElement interestRate = driver.findElement(By.id("intrstsrate"));
		
		/*
		 * Home Value:
			300000
			$Down payment:
			60000
			$ %Loan Amount:
			240000.00
			$Interest Rate:
			*/
		
		
		homeValue.sendKeys("1000000");
		downPayment.sendKeys("200000");
		loanAmount.sendKeys("800000");
		interestRate.sendKeys("3.8");
		
//Click on calculate button
		
		WebElement calculateButton = driver.findElement(By.name("cal"));
		
		calculateButton.click();
		
		
		//Monthly Payment $4,010.99

		
		

	}

}
