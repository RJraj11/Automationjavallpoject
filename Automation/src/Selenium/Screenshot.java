package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

public static void main (String [] args) throws InterruptedException, IOException {
	
	
		
	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	Thread.sleep(4000);


	Date a=new Date();
	System.out.println(a);
	String b=a.toString().replace(":","_").replace(" "," _").replace("IST"," ");
	System.out.println(b);

	for(int i=0;i<=5;i++)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File dest=new File("F:\\Screenshot\\screen"+i+""+b+".jpg");

		FileHandler.copy(src, dest);	
		Thread.sleep(1000);
	}
	}
}