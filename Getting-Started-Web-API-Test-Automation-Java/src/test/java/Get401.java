import data.TestData;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class Get401 extends BaseTest {

    @Test(dataProvider = "existingEndpointsRequireAuth", dataProviderClass = TestData.class)
    public void urlsThatNeedAuthenticationReturns401(String endpoint) throws IOException {
        response = baseApi.executeGETRequest(BASE_URL + endpoint);
        int actualStatusCode = response.getStatusLine().getStatusCode();
        assertEquals(actualStatusCode, STATUS_CODE_401, "Status code is not correct!");
    }
}
