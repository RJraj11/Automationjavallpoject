package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {


	public static void main (String [] args) throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		
		 driver.get("https://www.facebook.com/ ");
		 
		Thread.sleep(3000);
		 
		WebElement CreateNewAccount =driver.findElement(By.xpath("//a[text()='Create New Account']"));
		CreateNewAccount.click();
		
		Thread.sleep(3000);
		
		
		WebElement day =driver.findElement(By.xpath("//select[@id='day']"));//select fb create new ac date of birth
		
		Select s = new Select(day);
		
		s.selectByIndex(3);  //option no used eg. 2, 3, 4
		
		Thread.sleep(3000);
				
		s.selectByValue("10"); // select in front of double bracket code "----"
		
		Thread.sleep(3000);
		
	    s.selectByVisibleText("31"); //text select for search value.6
	    
	    Thread.sleep(3000);
	    
	    WebElement Month =driver.findElement(By.xpath("//select[@id='month']"));//select month tab
	    Select m = new Select(Month);
	    m.selectByIndex(2);
	    
	    Thread.sleep(3000);
	    
	    WebElement year =driver.findElement(By.xpath("//select[@id='year'] "));// select year
	    Select k = new Select(year);
	     
	    k.selectByVisibleText("1993");
	       
	    
	    		
	    		
	    
	    
	           
}
}