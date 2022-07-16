package JacksonJSONEx.JSONAnyGetterEx;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.HashMap;
import java.util.Map;


@JsonRootName(value = "ExBean")
public class ExtendableBean {
    public String name;
    private Map<String, String> properties;

    public ExtendableBean(String name) {
        this.name = name;
        properties =new HashMap<>();
    }
    @JsonAnyGetter
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public ExtendableBean() {
    }
}
