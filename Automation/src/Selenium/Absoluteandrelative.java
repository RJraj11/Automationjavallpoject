package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absoluteandrelative


{
	public static void main (String [] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		
		 driver.get("https://www.facebook.com/ ");
		 
	
		 WebElement input =driver.findElement(By.xpath("(//input)[2]"));
        
}
}