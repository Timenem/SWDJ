package webDriverBuilder;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
/**
 * WebDriver API provides a built-in method following the builder pattern to
 * create WebDriver instances. This feature is accessible through the static
 * method builder() of the RemoteWebDriver class and provides a fluent
 * API for creating WebDriver objects
 * */

public class WebDriverBuilder {

    static  WebDriver webDriver;

    @BeforeAll
    static void setupClass(){
//        WebDriverManager.firefoxdriver().setup();
        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
    }
//    @BeforeEach
//    void setup(){
////        webDriver = RemoteWebDriver.builder().oneOf(new FirefoxOptions()).build();
////        webDriver = RemoteWebDriver.builder().oneOf(new FirefoxOptions()).addAlternative(new ChromeOptions()).build();
//
////        webDriver= new FirefoxDriver();
//    }

    @AfterEach
    void  tearDown(){
        webDriver.quit();
    }
    @Test
    void test(){
        webDriver.get("https://ya.ru");
        String title = webDriver.getTitle();
        assert title.contains("yandex");
    }
}
