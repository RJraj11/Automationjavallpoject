package text.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.pack.LoginPage;

public class TestClass {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		
		
		
		
		
		
		
		 
		
	}
	
	

}
