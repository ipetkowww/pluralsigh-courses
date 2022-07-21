import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class Get404 extends BaseTest {

    @Test
    public void nonExistingUrlReturns404() throws IOException {
        response = baseApi.executeGETRequest(BASE_URL + "/nonExistingEndpoint");
        int statusCode = response.getStatusLine().getStatusCode();
        assertEquals(statusCode, 404, "Status Code is not correct.");
    }
}
