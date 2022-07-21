import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

public class BaseApi {

    private final CloseableHttpClient client;

    public BaseApi() {
        client = HttpClientBuilder.create().build();
    }

    public CloseableHttpResponse executeGETRequest(String url) throws IOException {
        return client.execute(new HttpGet(url));
    }

    public void close() throws IOException {
        client.close();
    }
}
