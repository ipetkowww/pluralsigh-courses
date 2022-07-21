package entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class RateLimit {

    private Integer coreLimit;

    public Integer getCoreLimit() {
        return coreLimit;
    }

    @SuppressWarnings("unchecked")
    @JsonProperty("resources")
    private void getNestedFields(Map<String, Object> jsonField) {
        Map<String, Integer> x = (Map<String, Integer>) jsonField.get("core");
        coreLimit = x.get("limit");
    }
}
