package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static driver.WebDriverSingleton.getChromeDriver;
import static driver.WebDriverSingleton.getWebDriverWait;

public class BrowsePage {

    private final WebDriver webDriver = getChromeDriver();
    private final WebDriverWait wait = getWebDriverWait();

    private static final By COURSE = By.cssSelector(".browse-search-results-item");
    private static final By SEARCH_FIELD = By.cssSelector(".browse-search-form-text");

    public void searchBy(String value) {
        WebElement element = webDriver.findElement(SEARCH_FIELD);
        element.sendKeys(value);
        element.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(COURSE));
    }

    public void filterBySkillLevels(String value) {
        By skillLevel = By.xpath(String.format("//label[@for='%s']", value));
        webDriver.findElement(skillLevel).click();
        wait.until(ExpectedConditions.elementToBeClickable(COURSE));
    }

    public void filterBySubject(String value) throws InterruptedException {
        By subject = By.xpath(String.format("//label[text()='%s']", value));
        webDriver.findElement(subject).click();
        Thread.sleep(2000); // just for testing purposes. will be removed later
    }

    public void clickOnCourse(String courseName) {
        String selector =
                String.format("//li[contains(@class, 'browse-search-results-item')]//strong[text()='%s']", courseName);
        By foundCourse = By.xpath(selector);
        webDriver.findElement(foundCourse).click();
    }

}
