package tests;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import pages.SiteCreation;

public class SiteCreateTestRunner extends SearchProjectTestRunner {
    RemoteWebDriver driver;
    @Test(priority = 3)
    public void creatingSitefaruk() throws InterruptedException {
        driver = super.getActiveDriver();
        SiteCreation site = new SiteCreation(driver);
        site.formFillup();
        site.dateSelect();
    }
}
