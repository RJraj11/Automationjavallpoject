package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
	

	public static void main (String [] args) throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		
		 driver.get("http://demo.guru99.com/test/delete_customer.php");
		 

   
		 
     WebElement Submit =driver.findElement(By.xpath("//input[@name='submit']"));
     Submit.click();    
     
     Thread.sleep(5000);
    Alert alt = driver.switchTo().alert();
    
    String text = alt.getText(); // to get the text present on browser.
    System.out.println(text);
    alt.accept(); //to click yes/ok/accept button and (only one action perform yes or no eg)
    alt.accept(); 
    //alt.dismiss(); //to click No/cancle dismiss button
    
    //above method is alert popup
    
	}
}
	
