package tests;

import base.Base;
import model.TimeOut;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.Credentials;


public class LoginTestRunner extends Base {
    RemoteWebDriver driver;
    Credentials credentials = new Credentials();
    TimeOut waitTime = new TimeOut();

    @Test(priority = 1)
    public void loginfaruk(){
        driver = super.getActiveDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        waitTime.timeOut(3000);
        loginPage.inputEmail(credentials.loginEmail);
        waitTime.timeOut(3000);
        loginPage.clickLanguageDropdown();
        waitTime.timeOut(3000);
        loginPage.chooseLanguage();
        waitTime.timeOut(3000);
        loginPage.clickNextBtn();
        waitTime.timeOut(3000);
        loginPage.inputPassword(credentials.loginPassword);
        loginPage.clickLoginBtn();
        waitTime.timeOut(10000);
    }
}