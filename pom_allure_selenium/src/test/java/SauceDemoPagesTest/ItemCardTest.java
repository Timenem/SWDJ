package SauceDemoPagesTest;

import SauseDemo.BasePage;
import SauseDemo.InventoryListPage;
import SauseDemo.ItemPage;
import SauseDemo.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ItemCardTest extends BaseTest{
    BasePage basePage = new BasePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    ItemPage itemPage = new ItemPage(driver);
    InventoryListPage inventoryListPage = new InventoryListPage(driver);
        @Test
        public void choiceOneItemAndBackToMainPage(){
            /*choice backpack and return to main page*/
            basePage.open();
            loginPage.fillFields();
            inventoryListPage.choiceBackPack();
            itemPage.clickToItem();
            itemPage.addItemToCart();
            itemPage.backToProd();
            Assertions.assertEquals(1, inventoryListPage.getShoppingCartQuantity());
        }





    }
