package JacksonJSONEx.JacksonJSONEx2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Solution {
        public static void main(String[] args) throws IOException {
            String jsonString = "{\"name\":\"Murka\",\"cats\":[{\"name\":\"Timka\"},{\"name\":\"Killer\"}]}";
            Reader reader=new StringReader(jsonString);
            ObjectMapper mapper = new ObjectMapper();
            Cat cat = mapper.readValue(reader, Cat.class);
            System.out.println(cat);
            System.out.println(cat.cats.getClass());
        }
}
