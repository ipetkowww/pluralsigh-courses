import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import static driver.WebDriverSingleton.getChromeDriver;

public class BaseTest {

    protected WebDriver webDriver;

    @BeforeSuite
    public void startBrowser() {
        webDriver = getChromeDriver();
        webDriver.manage().window().maximize();
    }

    @BeforeMethod
    public void goToSearchPage() {
        webDriver.get("https://www.pluralsight.com/browse");
    }

    @AfterSuite(alwaysRun = true)
    public void closeBrowser() {
        webDriver.close();
    }
}
