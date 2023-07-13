package pages;

import model.CommonMethods;
import model.LogoutLocators;
import model.TimeOut;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.TestData;

public class Logout {

    RemoteWebDriver driver;
    CommonMethods commonMethods;
    TimeOut waitTime = new TimeOut();
    TestData td = new TestData();

    public Logout(RemoteWebDriver driver) {
        this.driver = driver;
        commonMethods = new CommonMethods(this.driver);
    }
    public void loggedOut() throws InterruptedException {
        commonMethods.clickOnButton(LogoutLocators.downarrow);
        waitTime.timeOut(1000);
        commonMethods.clickOnField(LogoutLocators.logout);
        waitTime.timeOut(3000);
    }
}
