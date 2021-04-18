package testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import base.BaseTestClass;
import base.Browser;
import pages.SearchBox;

public class SearchBoxTest extends BaseTestClass{
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(HomePageTest.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = getDriver(Browser.CHROME);
		driver.get("https://amazon.in");
		log.info("Amazon site is opened");
	}

	@Test
	public void searchProduct() {
	SearchBox sb = new SearchBox(driver);
	sb.getSearchBox().sendKeys("Phones");
	sb.getSearchButton().click();
	log.info("Search Button is clicked");
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
