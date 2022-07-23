package pages.course;

public class CoursePage {

    private final CoursePageVerification coursePageVerification;

    private CoursePage(CoursePageVerification coursePageVerification) {
        this.coursePageVerification = coursePageVerification;
    }

    public static CoursePage create() {
        return new CoursePage(new CoursePageVerification());
    }

    public CoursePageVerification verify() {
        return coursePageVerification;
    }
}
