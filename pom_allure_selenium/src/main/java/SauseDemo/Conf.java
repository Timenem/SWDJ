package SauseDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Conf {
    static WebDriver driver;
    public static WebDriver createDriver() {
        System.setProperty("webdriver.gecko.driver", "/home/arm02/Desktop/Project_JW/Selenium/Iteco/src/main/resources/geckodriver");
        driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

}
