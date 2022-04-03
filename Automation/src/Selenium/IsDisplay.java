package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsDisplay {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.facebook.com/");
		
		WebElement createnewaccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createnewaccount.click();
		
		Thread.sleep(3000);
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("VIRAJ");
		
		Thread.sleep(3000);
		
		WebElement LastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		LastName.sendKeys("Bhokare");
		
		Thread.sleep(5000);
		
		WebElement EmailAddress = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		EmailAddress.sendKeys("bhokare11@gmail.com");
		
		//input[@data-type='password']
		
		WebElement Password = driver.findElement(By.xpath("//input[@data-type='password']"));
		Password.sendKeys("02183");

	    Thread.sleep(3000);
	    
		WebElement day =driver.findElement(By.xpath("//select[@id='day']"));//select fb create new ac date of birth
		
		Select s = new Select(day);
		
		s.selectByIndex(3);
		
	    Thread.sleep(3000);
		
		   
	    WebElement Month =driver.findElement(By.xpath("//select[@id='month']"));//select month tab
	    Select m = new Select(Month);
	    m.selectByIndex(2);
	    
	    Thread.sleep(3000);
	    
	    WebElement year =driver.findElement(By.xpath("//select[@id='year'] "));// select year
	    Select k = new Select(year);
	     
	    k.selectByVisibleText("1993");
	    
	    Thread.sleep(3000);
	    WebElement male =driver.findElement(By.xpath("(//input[@type='radio'])[2] "));
	    WebElement Female =driver.findElement(By.xpath("(//input[@type='radio'])[1] "));	
	    WebElement custom =driver.findElement(By.xpath("(//input[@type='radio'])[3] "));

	    WebElement Pronoun =driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
	    
	    custom.click();
	    
	    boolean result = Pronoun.isDisplayed();
	    
	    if(result == true)
	    {
	    	System.out.println("Displayed");
	    }
	    else
	    {
	    	System.out.println("hiden");
	    }
	    	
	    	    	
	    	
	    }
	    	
	    	
	    		
	    	
	    
	}
