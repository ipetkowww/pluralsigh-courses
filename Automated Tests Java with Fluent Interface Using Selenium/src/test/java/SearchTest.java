import enums.SkillLevel;
import enums.Subject;
import org.testng.annotations.Test;
import pages.browse.BrowsePage;
import pages.course.CoursePage;

public class SearchTest extends BaseTest {

    private final BrowsePage searchPage = BrowsePage.create();
    private final CoursePage coursePage = CoursePage.create();

    @Test
    public void searchTest() throws InterruptedException {
        searchPage.actions()
                .searchBy("java")
                .filterBySkillLevels(SkillLevel.BEGINNER)
                .filterBySubject(Subject.SOFTWARE_DEVELOPMENT)
                .clickOnCourse("Java 11 Fundamentals: Collections");

        coursePage.verify()
                .previewThisCourseButtonDisplayed();
    }
}
