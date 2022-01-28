package swdj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FoxTest {
    public static void setUp(){
        WebDriver webDriver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
        webDriver.manage().window().maximize();
    }
}



