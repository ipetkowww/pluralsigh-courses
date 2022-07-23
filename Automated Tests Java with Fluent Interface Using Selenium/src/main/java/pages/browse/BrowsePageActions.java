package pages.browse;

import actions.ActionOnPage;
import enums.SkillLevel;
import enums.Subject;
import org.openqa.selenium.By;

import static pages.browse.BrowsePageElements.COURSE;
import static pages.browse.BrowsePageElements.SEARCH_FIELD;

public class BrowsePageActions extends ActionOnPage {

    public BrowsePageActions searchBy(String value) {
        fillTextInElement(SEARCH_FIELD, value);
        pressEnterFromKeyboard(SEARCH_FIELD);
        waitUntilElementIsClickable(COURSE);
        return this;
    }

    public BrowsePageActions filterBySkillLevels(SkillLevel value) {
        click(By.xpath(String.format("//label[@for='%s']", value)));
        waitUntilElementIsClickable(COURSE);
        return this;
    }

    public BrowsePageActions filterBySubject(Subject value) throws InterruptedException {
        click(By.xpath(String.format("//label[text()='%s']", value)));
        waitUntilElementIsNotVisible(By.cssSelector(".loading"));
        return this;
    }

    public void clickOnCourse(String courseName) {
        String selector =
                String.format("//li[contains(@class, 'browse-search-results-item')]//strong[text()='%s']", courseName);
        By foundCourse = By.xpath(selector);
        click(foundCourse);
    }
}
