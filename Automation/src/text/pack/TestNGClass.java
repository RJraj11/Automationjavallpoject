package text.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.pack.HomePage;
import pom.pack.LoginPage;

public class TestNGClass {
	
	private WebDriver driver;
	private HomePage homePage;
	private LoginPage loginPage;
	
	
	@BeforeClass
	public void launchBrowser() {

		System.out.println("launchBrowser");
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
		  driver = new ChromeDriver();
		
}
	  
    @BeforeMethod
    public void loginFacebook() {
    	System.out.println("loginFacebook");
    	driver.get("https://www.facebook.com/");
        loginPage =new LoginPage(driver);
    	loginPage.loginpageclick();
    	
    }

    //test case 1
    @Test
    public void toVerifyNotificationTab() {
    	System.out.println("toVerifyNotificationTab");
    	 homePage = new HomePage(driver);
    	homePage.clickonnotificationbutton();
    	String url =driver.getCurrentUrl();
    	if(url.equals("dgghhhhjh"))
    	{
    		System.out.println("PASS");
    	}
    	else
    	{
    		System.out.println("FAIL");
    	}
    }

//test case 2
    @Test
    public void toVerifyMessangerTab() {
    	System.out.println("toVerifyMessangerTab");
    	 homePage.clickonmessengerbutton();
    	String url =driver.getCurrentUrl();
    	if(url.equals("wesasdsdd"))
    	{
    		System.out.println("PASS");
    	}
    	else
    	{
    		System.out.println("FAIL");
    	}
    }
    
    
    
    @AfterMethod
    public void logOutFacebook() throws InterruptedException {
    	Thread.sleep(5000);
    	homePage.clickonlogoutbutton();
    	Thread.sleep(5000);
    	System.out.println("logOutFacebook");
    	
    }
    
    @AfterClass
    public void closeBrowser() {
    	System.out.println("closeBrowser");
    	driver.quit();
    }
}
