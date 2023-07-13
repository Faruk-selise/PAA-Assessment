package pages;

import base.Base;
import model.CommonMethods;
import model.LoginLocators;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.Credentials;

public class LoginPage extends Base {
    RemoteWebDriver driver;
    CommonMethods commonMethods;
    Credentials credentials = new Credentials();
    public LoginPage(RemoteWebDriver driver) {
        this.driver = driver;
        commonMethods = new CommonMethods(this.driver);
    }
    public void openLoginPage(){
        driver.get(credentials.base_url);
    }
    public void clickLanguageDropdown(){
        commonMethods.clickOnField(LoginLocators.cdropedown);
    }
    public void chooseLanguage(){
        commonMethods.clickOnField(LoginLocators.selectenglish);
    }
    public void inputEmail(String loginEmail){
        commonMethods.setText(LoginLocators.email,loginEmail);
    }
    public void clickNextBtn(){
        commonMethods.clickOnButton(LoginLocators.nextbutton);
    }
    public void inputPassword(String loginPassword){
        commonMethods.setText(LoginLocators.password,loginPassword);
    }
    public void clickLoginBtn(){
        commonMethods.clickOnButton(LoginLocators.clickbutton);
    }
}
