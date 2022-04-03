package jay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepagejay {
	
public static void main (String [] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		
		 driver.get("(//a[@class=\"l\"])[1]");
		 
	
		 WebElement shop =driver.findElement(By.xpath("(//a[@class=\"l\"])[1]"));
		 
		 Thread.sleep(3000);
		 WebElement homeshop =driver.findElement(By.xpath("//nav[@class=\"woocommerce-breadcrumb\"]"));
        
}
}