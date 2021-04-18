package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBox {

	public WebDriver driver;
	
	By searchBox = By.id("twotabsearchtextbox");
//	By searchButton = By.id("nav-search-submit-button");
	By searchButton = By.id("nav-search-s");
	
	public SearchBox(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSearchBox() {
		
		return driver.findElement(searchBox);
	}
	
	public WebElement getSearchButton() {
		
		return driver.findElement(searchButton);
	}
}
