package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;
	 
	By userName = By.id("identifierId");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
		
	public WebElement userName() {
		
		return driver.findElement(userName);
	}
}
