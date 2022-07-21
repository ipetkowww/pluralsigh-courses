import entities.RateLimit;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static utils.ResponseUtils.deserializeJSON;

public class RateLimitEndpointTests extends BaseTest {

    @Test
    public void verifyResourcesCoreLimit() throws IOException {
        response = baseApi.executeGETRequest(BASE_URL + "/rate_limit");
        String jsonBodyAsString = EntityUtils.toString(response.getEntity());
        RateLimit rateLimit = deserializeJSON(jsonBodyAsString, RateLimit.class);

        assertEquals(rateLimit.getCoreLimit(), 60);
    }
}
