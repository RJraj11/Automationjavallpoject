package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Websearch {
	
		
		
		public static void main (String [] args) throws IOException {
			
			
			System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			 
			
			 driver.get("https://www.facebook.com/");
			 

	         //X Path by attribute
	         //tagname[@ attributename= 'attributevalue']
			 
		 WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
         email.sendKeys("bhokare.rajeshwar222@gmail.com");
         
         WebElement Pass =driver.findElement(By.xpath("//input[@type='password']"));
         Pass.sendKeys("123");
         
         WebElement Loginbutton =driver.findElement(By.xpath("//button[@name='login']"));
         Loginbutton.click();
        
         
         
        
		}
	}


