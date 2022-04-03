package Selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookproject {

	public static void main (String [] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
	 WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
     email.sendKeys("bhokare.rajeshwar222@gmail.com");
     
     WebElement Pass =driver.findElement(By.xpath("//input[@type='password']"));
     Pass.sendKeys("Facebook@123");
     
     Thread.sleep(3000);
     
     
     WebElement loginbutton =driver.findElement(By.xpath("//button[@name='login']"));
     loginbutton.click();
     
     WebElement logout =driver.findElement(By.xpath("//div[@aria-label='Account']"));
     logout.click();
     
     Thread.sleep(3000);
     
     WebElement logoutbutton =driver.findElement(By.xpath("(//i[contains(@class,'hu5pjgll')])[9]"));
     logoutbutton.click();

	}
}
