package tests;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import pages.SearchProject;

public class SearchProjectTestRunner extends LoginTestRunner {
    RemoteWebDriver driver;
    @Test(priority = 2)
    public void searchProjectfaruk() throws InterruptedException {
        driver = super.getActiveDriver();
        SearchProject searchProject = new SearchProject(driver);
        searchProject.projectSearch();
        searchProject.projectSelect();
    }
}
