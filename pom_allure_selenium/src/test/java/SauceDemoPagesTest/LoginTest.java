package SauceDemoPagesTest;


import SauseDemo.BasePage;
import SauseDemo.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest{
    LoginPage loginPage = new LoginPage(driver);
    BasePage basePage = new BasePage(driver);
    @Test
    public void openPage(){
        loginPage.open();
        loginPage.fillFields();
        Assertions.assertEquals("https://www.saucedemo.com/inventory.html",basePage.getUrl(),"");
    }
}
