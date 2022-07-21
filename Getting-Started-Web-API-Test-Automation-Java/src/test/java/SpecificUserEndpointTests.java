import entities.User;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;
import utils.ResponseUtils;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class SpecificUserEndpointTests extends BaseTest {

    @Test
    public void verifyLoginUsername() throws IOException {
        String expectedUser = "ipetkowww";
        response = baseApi.executeGETRequest(BaseTest.BASE_URL + "/users/" + expectedUser);
        String jsonBodyAsString = EntityUtils.toString(response.getEntity());
        User user = ResponseUtils.deserializeJSON(jsonBodyAsString, User.class);
        assertEquals(user.getLogin(), expectedUser, "Login username is not correct");
    }
}
