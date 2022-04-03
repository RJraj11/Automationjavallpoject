package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lencekartproject {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.lenskart.com/");
		
		 Thread.sleep(2000);
		
		WebElement computerglass =driver.findElement(By.xpath("(//div[text()='Computer Glasses'])[1]"));
		
		   Actions act = new Actions(driver);
	       act.moveToElement(computerglass).build().perform();
	       
	       Thread.sleep(2000);
	       WebElement Orders=driver.findElement(By.xpath("//div[text()='Blu 0 Computer Glasses']"));
	       act.moveToElement(Orders).click().build().perform();
		
		
	}

}
