import data.TestData;
import org.apache.http.client.methods.HttpGet;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class Get200 extends BaseTest {


    @Test(dataProvider = "existingEndpointsWithoutAuth", dataProviderClass = TestData.class)
    public void existingEndpointsWithoutAuthenticationReturn200(String endpoint) throws IOException {
        HttpGet get = new HttpGet(BaseTest.BASE_URL + endpoint);
        response = client.execute(get);
        int statusCode = response.getStatusLine().getStatusCode();
        assertEquals(statusCode, BaseTest.STATUS_CODE_200, "Status Code is not correct.");
    }
}
