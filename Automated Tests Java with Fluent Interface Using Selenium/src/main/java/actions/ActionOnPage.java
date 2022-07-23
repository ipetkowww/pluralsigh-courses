package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static driver.WebDriverSingleton.getChromeDriver;
import static driver.WebDriverSingleton.getWebDriverWait;

public class ActionOnPage {

    private final WebDriver webDriver = getChromeDriver();
    private final WebDriverWait wait = getWebDriverWait();

    protected WebElement findElement(By locator) {
        return webDriver.findElement(locator);
    }

    protected void fillTextInElement(By locator, String text) {
        findElement(locator).sendKeys(text);
    }

    protected void pressEnterFromKeyboard(By locator) {
        findElement(locator).sendKeys(Keys.ENTER);
    }

    protected void click(By locator) {
        findElement(locator).click();
    }

    protected void waitUntilElementIsClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected void waitUntilElementIsNotVisible(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

}
