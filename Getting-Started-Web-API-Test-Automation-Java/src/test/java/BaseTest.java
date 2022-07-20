import data.TestData;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {

    protected static final String BASE_URL = "https://api.github.com";
    protected static final int STATUS_CODE_200 = 200;
    protected static final int STATUS_CODE_401 = 401;

    protected CloseableHttpClient client;
    protected CloseableHttpResponse response;

    @BeforeMethod
    public void setup() {
        client = HttpClientBuilder.create().build();
    }

    @AfterTest
    public void closeResources() throws IOException {
        client.close();
        response.close();
    }
}
