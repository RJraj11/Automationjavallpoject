package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sizechange {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		Dimension d = new Dimension (300, 900); //W * H Pixels
		driver.manage().window().setSize(d);
		
		Thread.sleep(5000);
		
		Point p = new Point (300, 600);
		driver.manage().window().setPosition(p);
		
		
	}

}
