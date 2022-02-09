package Base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;

    @BeforeEach
    public  void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
//        ожидание загрузки страницы
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        ожидание появления элемента на странице
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        PageManager.setDriver(driver);
    }
    @AfterEach
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}

