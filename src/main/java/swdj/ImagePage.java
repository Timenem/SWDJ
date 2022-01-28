package swdj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImagePage {

    public WebDriver webDriver;

    public ImagePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver,this);
        this.webDriver = webDriver;
    }
    @FindBy(xpath = "//image")
    private WebElement imageIco;
    
}
