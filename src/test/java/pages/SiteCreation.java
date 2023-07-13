package pages;
import model.CommonMethods;
import model.SiteCreateLocators;
import model.TimeOut;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.TestData;

public class SiteCreation {
    RemoteWebDriver driver;
    CommonMethods commonMethods;
    TimeOut waitTime = new TimeOut();
    TestData td = new TestData();

    public SiteCreation(RemoteWebDriver driver) {
        this.driver = driver;
        commonMethods = new CommonMethods(this.driver);
    }
    public void formFillup() throws InterruptedException {

        commonMethods.setText(SiteCreateLocators.sName,td.siteName);
        waitTime.timeOut(3000);
        commonMethods.setText(SiteCreateLocators.saddress,td.siteAddress);
        waitTime.timeOut(3000);
        commonMethods.keyboardAction(SiteCreateLocators.saddress,Keys.ARROW_DOWN,Keys.ENTER);
        waitTime.timeOut(3000);
        commonMethods.setText(SiteCreateLocators.street,td.street);
        waitTime.timeOut(3000);
        commonMethods.setText(SiteCreateLocators.sno,td.streetNo);
        waitTime.timeOut(3000);
        commonMethods.setText(SiteCreateLocators.zip,td.zip);
        waitTime.timeOut(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement contactNameElem = driver.findElement(By.xpath("//input[@id='ContactPersonName']"));
        js.executeScript("arguments[0].scrollIntoView(true);",contactNameElem);
        waitTime.timeOut(3000);

        commonMethods.setText(SiteCreateLocators.cName,td.cName);
        waitTime.timeOut(3000);
        commonMethods.setText(SiteCreateLocators.cEmail,td.cEmail);
        waitTime.timeOut(3000);
        commonMethods.setText(SiteCreateLocators.cPhone,td.cPhone);
        waitTime.timeOut(3000);
    }

    public void dateSelect(){
        commonMethods.clickOnButton(SiteCreateLocators.sDateb);
        waitTime.timeOut(3000);
        commonMethods.clickOnButton(SiteCreateLocators.sDatem);
        waitTime.timeOut(3000);
        commonMethods.clickOnField(SiteCreateLocators.sYears);
        waitTime.timeOut(3000);
        commonMethods.clickOnField(SiteCreateLocators.sMonths);
        waitTime.timeOut(3000);
        commonMethods.clickOnField(SiteCreateLocators.sDates);
        waitTime.timeOut(3000);
        commonMethods.clickOnButton(SiteCreateLocators.eDateb);
        waitTime.timeOut(3000);
        commonMethods.clickOnButton(SiteCreateLocators.sDatem);
        waitTime.timeOut(3000);
        commonMethods.clickOnField(SiteCreateLocators.eYears);
        waitTime.timeOut(3000);
        commonMethods.clickOnField(SiteCreateLocators.eMonths);
        waitTime.timeOut(3000);
        commonMethods.clickOnField(SiteCreateLocators.eDates);
        waitTime.timeOut(3000);
        commonMethods.setText(SiteCreateLocators.siteNotice,td.siteNotice);
        waitTime.timeOut(3000);
        commonMethods.clickOnField(SiteCreateLocators.uncheck);
        waitTime.timeOut(3000);
        commonMethods.clickOnButton(SiteCreateLocators.savebtn);
        waitTime.timeOut(3000);
    }

}
