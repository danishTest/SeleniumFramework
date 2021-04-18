package testcases;

import java.io.IOException;

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
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = getDriver(Browser.CHROME);
		driver.get("https://amazon.in");
	}

	@Test
	public void searchProduct() {
	SearchBox sb = new SearchBox(driver);
	sb.getSearchBox().sendKeys("Phones");
	sb.getSearchButton().click();
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
