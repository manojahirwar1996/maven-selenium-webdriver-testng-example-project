package testcases.mytheresa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	WebDriver driver;
	public WebDriver driverSettings() {


		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

		return driver;
	}

}
