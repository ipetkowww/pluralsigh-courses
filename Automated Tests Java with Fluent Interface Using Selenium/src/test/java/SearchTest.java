import org.testng.annotations.Test;
import pages.BrowsePage;
import pages.CoursePage;

public class SearchTest extends BaseTest {

    private final BrowsePage searchPage = new BrowsePage();
    private final CoursePage coursePage = new CoursePage();

    @Test
    public void searchTest() throws InterruptedException {
        searchPage.searchBy("java")
                .filterBySkillLevels("Beginner")
                .filterBySubject("Software development")
                .clickOnCourse("Java 11 Fundamentals: Collections");

        coursePage.verifyPreviewThisCourseButtonDisplayed();
    }
}
