package seleniumMethods;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class Methods {
    static WebDriver webDriver ;

    @BeforeAll
    static void  setUp(){
        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
    }

    @AfterEach
    void tearDown(){
        webDriver.quit();
    }

    @Test
    void testByLinkText() {
        String url = "https://bonigarcia.dev/selenium-webdriver-java/web-form.html";
        webDriver.get(url);
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        Assertions.assertEquals(webDriver.getTitle(),"Hands-On Selenium WebDriver with Java");
        WebElement linkText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Return to index")));
        Assertions.assertEquals(linkText.getCssValue("cursor"),"pointer");
    }

    @Test
    void testByCssSelector(){
        String url = "https://bonigarcia.dev/selenium-webdriver-java/web-form.html";
        webDriver.get(url);
        WebDriverWait wait = new WebDriverWait(webDriver, 10);

        WebElement text=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("my-text-id")));
        text.sendKeys("test text");
        WebElement pwd=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("my-password")));
        text.sendKeys("fkls");
    }


    @Test
    void testByIdOrName(){
        /**поиск по id если id недоступен тогда ищет по имени*/
        String url = "https://bonigarcia.dev/selenium-webdriver-java/web-form.html";
        webDriver.get(url);
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        WebElement fileElement=wait.until(ExpectedConditions.presenceOfElementLocated(new ByIdOrName("my-file")));
        Assertions.assertTrue(fileElement.getAttribute("id").isBlank());
        Assertions.assertFalse(fileElement.getAttribute("name").isBlank());
    }

    @Test
    void testByChained(){
        /**ищет элементы в последовательности второй внутри первого*/
        String url = "https://bonigarcia.dev/selenium-webdriver-java/web-form.html";
        webDriver.get(url);
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        List<WebElement> webElements = wait.until(ExpectedConditions.
                presenceOfAllElementsLocatedBy(new ByChained(By.tagName("form"), By.className("row"))));
        Assertions.assertEquals(webElements.size(),1);
    }

    @Test
    void testByAll(){
        /**ищет все элементы соответвующие их местоположению*/
        String url = "https://bonigarcia.dev/selenium-webdriver-java/web-form.html";
        webDriver.get(url);
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        List<WebElement> webElements = wait.until(ExpectedConditions.
                presenceOfAllElementsLocatedBy(new ByAll(By.tagName("form"), By.className("row"))));
        Assertions.assertEquals(webElements.size(),5);
    }

    @Test
     void testUploadFile() throws IOException {
        /**загрузка файла необходимо использовать абсолютный путь до файла*/
        String url = "https://bonigarcia.dev/selenium-webdriver-java/web-form.html";
        webDriver.get(url);
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        WebElement inputFile = wait.until(ExpectedConditions.
                            presenceOfElementLocated(By.name("my-file")));

        String tempFile = "/home/hind/Desktop/java_proj/SWDJ/src/main/resources/test.txt";
        inputFile.sendKeys(tempFile);
    }

}
