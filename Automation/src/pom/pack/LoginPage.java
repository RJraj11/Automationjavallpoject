package pom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
private WebDriver driver;
	
	@FindBy (xpath = "//input[@type='text']")
	private WebElement userName ;
	
	@FindBy ( xpath = "//input[@type='password']")
	private WebElement password ;
	
	@FindBy ( xpath = "//button[@name='login']")
	private WebElement logInButton;
	
	//@FindBy ( xpath = "//a[text()='Forgotten password?']")
	//private WebElement forgotpassword;
	
	
	
	public LoginPage (WebDriver driver) { //driver1 = driver = new chromeDriver()
		
		PageFactory.initElements(driver, this);
		this. driver = driver;
	}
	
	public void sendUserName() {
		if(userName.isDisplayed()) {
			userName.sendKeys("bhokare.rajeshwar222@gmail.com");
		}
	}
	
	public void sendPassword() {
		if(password.isDisplayed()) {
			password.sendKeys("Facbook@123");
		}
	}

	public void clickOnLogInButton() {
		if(logInButton.isDisplayed()) {
			logInButton.click();
		}
	}
	
	//public void clickOnforgotPassword() {
	//	if(forgotpassword.isDisplayed()) {
	//		forgotpassword.click();
	//	}
	//}
    
	public void loginpageclick() {
		userName.sendKeys("bhokare.rajeshwar222@gmail.com");
		password.sendKeys("89565457");
		logInButton.click();
}
}