package SauseDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryListPage extends BasePage{

    public InventoryListPage(WebDriver driver) {
        super(driver);
    }

    By twitter = By.cssSelector("li[class='social_twitter']");
    By facebook = By.cssSelector("li[class='social_facebook']");
    By linkedIn = By.cssSelector("li[class='social_linkedin']");
    By backpack = By.xpath("//*[contains(text(),'Sauce Labs Backpack')]");
    By shopCartCount = By.cssSelector("span[class='shopping_cart_badge']");
    By navbarButton = By.cssSelector("div[class='bm-burger-button']");
    By closeNavBarButton = By.cssSelector("div[class='bm-cross-button']");
    By logOut = By.xpath("//*[contains(text(),'Logout')]");
   
    public void checkSocialTwitterIsDisplayed(){
        /*find twitter icon*/
        driver.findElement(twitter).isDisplayed();
    }

    public void checkSocialFacebookIsDisplayed(){
        /*find facebook icon*/
        driver.findElement(facebook).isDisplayed();
    }

    public void checkSocialLinkedInIsDisplayed(){
        /*find linkedin icon*/
        driver.findElement(linkedIn).isDisplayed();
    }

    public void choiceBackPack(){
        /*choice backpack*/
        driver.findElement(backpack).click();
    }

    public void clickNavBar() {
        /*click let side navbar*/
        driver.findElement(navbarButton).click();
    }

    public void closeNavbar(){
        /*close navbar*/
        driver.findElement(closeNavBarButton).click();
    }

    public void clickLogOut(){
        /*click logout from open navbar*/
        driver.findElement(logOut).click();
    }

    public int getShoppingCartQuantity() {
        /*return cart quantity*/
        WebElement count = driver.findElement(shopCartCount);
        return Integer.parseInt(String.valueOf(count.getText()));
    }



}
