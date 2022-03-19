package SauseDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By userName = By.id("user-name");
    By userPassword =By.id("password");
    By logBtn = By.xpath("//input[@id='login-button']");

    By botImage = By.cssSelector("div[class='bot_column']");


  public void fillFields(){
      /*fill all fields*/
      driver.findElement(userName).sendKeys("standard_user");
      driver.findElement(userPassword).sendKeys("secret_sauce");
      driver.findElement(logBtn).click();
  }

  public void enterLogin(String userLogin){
      driver.findElement(userName).sendKeys();
  }
  public void enterPassword(String userPasswd){
      driver.findElement(userPassword).sendKeys(userPasswd);
  }

  public void logIn(){
      driver.findElement(logBtn).click();
  }

  public void checkBotImage(){
        /*check bot image*/
      driver.findElement(botImage).isDisplayed();
  }
}
