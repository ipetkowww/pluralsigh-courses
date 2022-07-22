package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static driver.WebDriverSingleton.getChromeDriver;
import static org.testng.Assert.assertTrue;

public class CoursePage {

    private final WebDriver webDriver = getChromeDriver();
    private static final By PREVIEW_THIS_COURSE_BUTTON = By.cssSelector("#play-overview-button");

    public void verifyPreviewThisCourseButtonDisplayed() {
        assertTrue(webDriver.findElement(PREVIEW_THIS_COURSE_BUTTON).isDisplayed(),
                "Preview This Course button is not displayed");
    }

}
