package Selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Raj {
		
			
			public static void main (String [] args) throws InterruptedException {
				
				
				System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				 
				
				 driver.get("https://chromedriver.chromium.org/ ");
				 
				 Thread.sleep(2000);
			
				 driver.navigate().to("https://www.facebook.com/");
				 Thread.sleep(2000);
				 driver.navigate().back();
				 Thread.sleep(2000);
				 driver.navigate().forward();
				 Thread.sleep(2000);
				 driver.navigate().refresh();
				 
				 String url=driver.getCurrentUrl();
				 System.out.println(url);
				 String Raj=driver.getTitle();
				 System.out.println(Raj);
				 
				 
				 
				
				 

			}
		}




