package base;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.time.Duration;

public class Base {
    private enum Drivers{
        ChromeDriver,
        FirefoxDriver,
    }
    RemoteWebDriver activeDriver;
    public ChromeOptions option = new ChromeOptions();

    @BeforeTest
    public void setUpBrowser(){
        option.addArguments("--remote-allow-origins=*");
        setActiveDriver(Drivers.ChromeDriver);
        activeDriver.manage().window().maximize();
        activeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    private void setActiveDriver(Drivers driver){

        if(driver == Drivers.FirefoxDriver){
            activeDriver = new FirefoxDriver();
        }
        else if(driver == Drivers.ChromeDriver){
            activeDriver = new ChromeDriver(option);
        }
    }

    public RemoteWebDriver getActiveDriver(){
        return activeDriver;
    }


    @AfterTest
    public void closeBrowser(){
        activeDriver.close();
    }

}
