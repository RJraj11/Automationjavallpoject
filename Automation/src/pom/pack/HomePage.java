package pom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	

private WebDriver driver ;
	
	@FindBy ( xpath = "//a[@aria-label='Notifications']")
	private WebElement notificationbutton;
	

	
	@FindBy ( xpath = "(//div[@aria-label='Messenger'])[1]")
	private WebElement messengerbutton;
	
	@FindBy ( xpath = "//div[@aria-label='Account']")
	private WebElement logoutbutton;
	
	@FindBy ( xpath = "(//i[contains(@class,'hu5pjgll')])[9]")
	private WebElement logouticon;

public HomePage (WebDriver driver) { //driver1 = driver = new chromeDriver()
		
		PageFactory.initElements(driver, this);
		this. driver = driver;
		
		
	}
      public void clickonnotificationbutton () {
	  if(notificationbutton.isDisplayed()) {
		  notificationbutton.click();
		  
	  }
      }
      public void clickonmessengerbutton () {
    	  if(messengerbutton.isDisplayed()) {
    		  messengerbutton.click();
}
}
      
      public void clickonlogoutbutton () {
    	  if(logoutbutton.isDisplayed()) {
    		  logoutbutton.click();
    		  logouticon.click();
}
}
      
      
}
