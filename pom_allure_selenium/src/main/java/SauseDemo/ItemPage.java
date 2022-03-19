package SauseDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage extends BasePage{
    public ItemPage(WebDriver driver) {
        super(driver);
    }

    By backPackItem = By.xpath("//*[contains(text(),'Sauce Labs Backpack')]");
    By addToCart = By.xpath("//*[contains(text(),'Add to cart')]");
    By backToProducts = By.xpath("//*[contains(text(),'Back to products')]");

    public void clickToItem(){
        driver.findElement(backPackItem).click();
    }

    public void addItemToCart(){
        driver.findElement(addToCart).click();
    }

    public void backToProd(){
        driver.findElement(backToProducts).click();
    }


}
