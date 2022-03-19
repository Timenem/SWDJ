package SauceDemoPagesTest;

import SauseDemo.BasePage;
import SauseDemo.InventoryListPage;
import SauseDemo.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class LogOutTest extends BaseTest{
    LoginPage loginPage = new LoginPage(driver);
    BasePage basePage = new BasePage(driver);
    InventoryListPage inventoryListPage = new InventoryListPage(driver);
    @Test
    public void logOut() throws InterruptedException {
        loginPage.open();
        loginPage.fillFields();
        inventoryListPage.clickNavBar();
        TimeUnit.SECONDS.sleep(2);
        inventoryListPage.clickLogOut();
        Assertions.assertEquals("https://www.saucedemo.com/",basePage.getUrl(), "Urls should be equal");
    }
}
