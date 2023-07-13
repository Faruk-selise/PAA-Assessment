package pages;
import base.Base;
import model.CommonMethods;
import model.SearchProjectLocators;
import model.TimeOut;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.TestData;

public class SearchProject extends Base {
    RemoteWebDriver driver;
    CommonMethods commonMethods;
    TimeOut waitTime = new TimeOut();
    TestData td = new TestData();

    public SearchProject(RemoteWebDriver driver) {
        this.driver = driver;
        commonMethods = new CommonMethods(this.driver);
    }
    public void projectSearch() throws InterruptedException {
        commonMethods.clickOnButton(SearchProjectLocators.pbtn);
        waitTime.timeOut(1000);
        commonMethods.clickOnField(SearchProjectLocators.pinput);
        waitTime.timeOut(1000);
        commonMethods.setText(SearchProjectLocators.pinput, td.projectName);
        waitTime.timeOut(3000);
    }
    public void projectSelect() throws InterruptedException {
        commonMethods.clickOnButton(SearchProjectLocators.pselect);
        waitTime.timeOut(3000);
        commonMethods.clickOnButton(SearchProjectLocators.addBtn);
        waitTime.timeOut(3000);
    }
}
