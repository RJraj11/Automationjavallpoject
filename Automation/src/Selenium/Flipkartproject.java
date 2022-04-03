package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartproject {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
	    WebElement email =driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		email.sendKeys("9561940711");//enter real id 
		Thread.sleep(2000);
		
		 WebElement password =driver.findElement(By.xpath("//input[@type='password']"));
	     password.sendKeys("9561940711"); //enter real pass
	     Thread.sleep(2000);
	     
	     WebElement login =driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	     login.click();
	     Thread.sleep(2000);
		
 	   WebElement myac =driver.findElement(By.xpath("(//div[@class='exehdJ'])[1]"));
	
	   Actions act = new Actions(driver);
       act.moveToElement(myac).build().perform();
       
       Thread.sleep(2000);
       WebElement logout=driver.findElement(By.xpath("//div[text()='Logout']"));
       act.moveToElement(logout).click().build().perform();
	
}
}