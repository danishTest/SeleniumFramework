package testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Base;
import base.BaseTestClass;
import base.Browser;
import pages.HomePage;

public class HomePageTest extends BaseTestClass{
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver = getDriver(Browser.CHROME);
		log.info("Driver is initialized");
		driver.get("https://gmail.com");
		log.info("Url is opened");
	}
	
	@Test(dataProvider="getData")
	public void enterUserName(String uname) throws IOException {
		
				
		HomePage homePage = new HomePage(driver);
		homePage.userName().clear();
		homePage.userName().sendKeys(uname);
		homePage.userName().sendKeys(Keys.ENTER);
		log.info("Success");
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[2][1];
		data[0][0] = "sdanish.cse";
		data[1][0] = "9962391426";
		return data;
	}
	
	
	  @AfterTest public void teardown() {
	  
	  driver.quit(); }
	 
}
