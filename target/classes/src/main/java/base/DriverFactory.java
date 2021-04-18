package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	// Singleton Design Pattern
	private static final DriverFactory driverFactory = new DriverFactory();

	private DriverFactory() {

	}

	public static DriverFactory getDriverFactory() {

		return driverFactory;
	}

	//Factory Pattern
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	public WebDriver getDriver(Browser browserName) {

		if (driver.get() == null) {
			switch (browserName) {
			case CHROME:
				driver.set(new ChromeDriver());
				break;
			case FIREFOX:
				driver.set(new FirefoxDriver());
				break;
			default:
				break;
			}
		}
		return driver.get();
	}
}
