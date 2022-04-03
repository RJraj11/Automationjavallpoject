package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonproject {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();

	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement language=driver.findElement(By.xpath("//a[@aria-label='Choose a language for shopping.']"));
	Actions act=new Actions(driver);
	act.moveToElement(language).build().perform();
	
	Thread.sleep(2000);
	WebElement link=driver.findElement(By.xpath("(//div[@class='icp-mkt-change-lnk'])[1]"));
	act.moveToElement(link).click().build().perform();

}
}
