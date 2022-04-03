package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitingtime {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	//Implicit wait
	//waiting time
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	
    driver.get("https://www.amazon.com/");
    
    WebElement login = driver.findElement(By.xpath("//a[text()='Sign in securely']"));
    login.click();
    
//Explicit Wait
    //Waiting time+condition
    
    WebDriverWait wait = new WebDriverWait(driver, 20);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Sign in securely']")));
 
   
    
  
    
    
    

    
	}
}
	
	

		
		
	


