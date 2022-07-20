import data.TestData;
import org.apache.http.client.methods.HttpGet;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class Get401 extends BaseTest {

    @Test(dataProvider = "existingEndpointsRequireAuth", dataProviderClass = TestData.class)
    public void urlsThatNeedAuthenticationReturns401(String endpoint) throws IOException {
        HttpGet get = new HttpGet(BASE_URL + endpoint);
        response = client.execute(get);
        int actualStatusCode = response.getStatusLine().getStatusCode();
        assertEquals(actualStatusCode, STATUS_CODE_401, "Status code is not correct!");
    }

}
