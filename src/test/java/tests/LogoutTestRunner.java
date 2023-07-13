package tests;
import model.TimeOut;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import pages.Logout;


public class LogoutTestRunner extends SiteCreateTestRunner {
    RemoteWebDriver driver;
    TimeOut waitTime = new TimeOut();

    @Test(priority = 4)
    public void logoutfaruk() throws InterruptedException {
            driver = super.getActiveDriver();
            Logout logout = new Logout(driver);
            logout.loggedOut();
            waitTime.timeOut(3000);
        }
}
