package SauseDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        /*open url*/
        driver.get("https://www.saucedemo.com/");
    }

    public String getUrl(){
        return  driver.getCurrentUrl();
    }


    public void scrollPage(int end){
        /*scroll page to down*/
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript(String.format("window.scrollBy(0,%d)",end));
    }

    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
