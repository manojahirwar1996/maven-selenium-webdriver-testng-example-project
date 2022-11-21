package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {

    public WebDriver driver;

    @BeforeClass
    public void setup(){

        BrowserSetting bs = new BrowserSetting();

        driver = bs.BrowserSettings();

    }



    @AfterClass
    public  void teardown(){
        driver.close();

    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
