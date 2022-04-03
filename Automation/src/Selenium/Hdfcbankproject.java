package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hdfcbankproject {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/");
		
		//span[text()='Apply now']
		
		WebElement applynow =driver.findElement(By.xpath("//span[text()='Apply now']"));
		
		   Actions act = new Actions(driver);
	       act.moveToElement(applynow).build().perform();
	       
	       Thread.sleep(2000);
	       WebElement Orders=driver.findElement(By.xpath("//a[text()='SmartHub for Merchants']"));
	       act.moveToElement(Orders).click().build().perform();			
		
	}

}
