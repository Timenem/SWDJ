package SauceDemoPagesTest;

import SauseDemo.BasePage;
import SauseDemo.InventoryListPage;
import SauseDemo.LoginPage;
import org.junit.jupiter.api.Test;

public class InventoryPageTest extends BaseTest{
    BasePage basePage = new BasePage(driver);
    InventoryListPage inventoryListPage = new InventoryListPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    @Test
    public void checkSocialMediaLinksOnPage(){
        /*check social media links*/
        basePage.open();
        loginPage.fillFields();
        basePage.scrollPage(300);
        inventoryListPage.checkSocialFacebookIsDisplayed();
        inventoryListPage.checkSocialLinkedInIsDisplayed();
        inventoryListPage.checkSocialTwitterIsDisplayed();
    }
}
