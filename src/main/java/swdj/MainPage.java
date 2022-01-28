package swdj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public WebDriver webDriver;
    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.webDriver =driver;
    }



}
