package pages.course;

import org.openqa.selenium.WebDriver;

import static driver.WebDriverSingleton.getChromeDriver;
import static org.testng.Assert.assertTrue;
import static pages.course.CoursePageElement.PREVIEW_THIS_COURSE_BUTTON;

public class CoursePageVerification {

    private WebDriver webDriver = getChromeDriver();

    public void previewThisCourseButtonDisplayed() {
        assertTrue(webDriver.findElement(PREVIEW_THIS_COURSE_BUTTON).isDisplayed(),
                "Preview This Course button is not displayed");
    }
}
