package base;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTestClass {

	private static List<WebDriver> driverPool = new ArrayList<WebDriver>();
	
	@BeforeSuite
	public void initialSetup() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		
	}
	
	public WebDriver getDriver(Browser browserName) {
		
		WebDriver driver = DriverFactory.getDriverFactory().getDriver(browserName);
		driverPool.add(driver);
		
		return driver;
		
	}
	
	/*
	 * @AfterSuite public void teardown() {
	 * 
	 * for (WebDriver webDriver : driverPool) { webDriver.quit(); } }
	 */
}
