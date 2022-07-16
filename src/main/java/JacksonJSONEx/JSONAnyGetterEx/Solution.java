package JacksonJSONEx.JSONAnyGetterEx;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class Solution {
    public static void main(String[] args) throws IOException {

        ExtendableBean bean = new ExtendableBean("My bean");
        bean.getProperties().put("attr1", "val1");
        bean.getProperties().put("attr2", "val2");

        ObjectMapper objectMapper=new ObjectMapper();
        StringWriter stringWriter=new StringWriter();
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        objectMapper.writeValue(stringWriter, bean);
//        StringReader stringReader=new StringReader(stringWriter.toString());
        System.out.println(stringWriter.toString());
//        ExtendableBean extendableBean=objectMapper.readValue(stringReader, ExtendableBean.class);


    }
}
