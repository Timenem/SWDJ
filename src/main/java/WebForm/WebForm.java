package WebForm;

import Base.BasePage;
import Base.PageManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions ;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebForm  extends PageManager {

    public WebForm(WebDriver webDriver) {
        webDriver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        PageFactory.initElements(webDriver,this);
    }


    @FindBy(id = "my-text-id")
    private WebElement textInput ;

    @FindBy(name="my-password")
    private WebElement password;

    @FindBy(name="my-textarea")
    private WebElement textArea;

//    //select[@name='my-select']/option[text()='One']
    @FindBy(xpath = "//select[@name='my-select']/option[text()='One']")
    private WebElement dropDown;

    @FindBy(name="my-file")
    private WebElement fileInput;


    @FindBy(xpath = "//*[@class='day' and text()='2']")
    private WebElement datePicker;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btn;


    public WebForm sendDate(String textVal,String passwordVal,String textAreaVal){
//        textInput.click();
        textInput.sendKeys(textVal);
//        password.click();
        password.sendKeys(passwordVal);
        textArea.click();
        textArea.sendKeys(textAreaVal);
        dropDown.click();
        btn.click();
        return this;
    }
}

