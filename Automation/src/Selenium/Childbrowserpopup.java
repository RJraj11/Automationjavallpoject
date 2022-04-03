package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Childbrowserpopup {


	public static void main (String [] args) throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		//Implicit wait
		//waiting time
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 
		
		 driver.get("https://www.w3schools.com/js/js_popup.asp");
		 

   
		 
     WebElement tryItyourself =driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
    
   //Explicit Wait
     //Waiting time+condition
     
     WebDriverWait wait = new WebDriverWait(driver, 20);
    WebElement conform =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Try it Yourself »'])[1]")));
  
    
     
     
     
     
     
     
     
     
     
     
     
     
//     
//     Thread.sleep(5000);
//    Alert alt = driver.switchTo().alert();
//    
//    String text = alt.getText(); // to get the text present on browser.
//    System.out.println(text);
//    alt.accept(); //to click yes/ok/accept button and (only one action perform yes or no eg)
//    alt.accept(); 
//    //alt.dismiss(); //to click No/cancle dismiss button
//    
//    //above method is alert popup
//    
	}
}
	
