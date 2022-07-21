import data.TestData;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class Get200 extends BaseTest {

    @Test(dataProvider = "existingEndpointsWithoutAuth", dataProviderClass = TestData.class)
    public void existingEndpointsWithoutAuthenticationReturn200(String endpoint) throws IOException {
        response = baseApi.executeGETRequest(BaseTest.BASE_URL + endpoint);
        int statusCode = response.getStatusLine().getStatusCode();
        assertEquals(statusCode, BaseTest.STATUS_CODE_200, "Status Code is not correct.");
    }
}
