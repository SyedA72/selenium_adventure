package saturdayReview;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techcircleschool.com");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		title = title.replace("|", "");
		System.out.println(title);
		
		String arr[] = title.split(" ");
		
		ArrayList<String> words = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			
			if (arr[i].trim().length()  > 0) {
				words.add(arr[i]);
			}
			
//			System.out.println(i +" "+ arr[i]);
			
		}
		
		
		System.out.println("Word count = "+ words.size());
		
		
		driver.close();
		
	}
}
