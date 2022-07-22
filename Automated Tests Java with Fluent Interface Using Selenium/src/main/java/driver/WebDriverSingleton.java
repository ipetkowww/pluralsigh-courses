package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverSingleton {

    private static WebDriver webDriver;
    private static WebDriverWait wait;

    // prevent instantiation using constructor
    private WebDriverSingleton() {}

    public static WebDriver getChromeDriver() {
        if (webDriver == null) {
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
        }
        return webDriver;
    }

    public static WebDriverWait getWebDriverWait() {
        if (wait == null) {
            wait = new WebDriverWait(getChromeDriver(), Duration.ofSeconds(10));
        }
        return wait;
    }
}
