package data;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider
    public static Object[][] existingEndpointsWithoutAuth() {
        return new Object[][]{
                {"/"},
                {"/emojis"},
                {"/events"}
        };
    }

    @DataProvider
    public static Object[][] existingEndpointsRequireAuth() {
        return new Object[][] {
                {"/user"},
                {"/user/followers"},
                {"/notifications"},
        };
    }
}
