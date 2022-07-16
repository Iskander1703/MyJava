package JacksonJSONEx.JacksonJSONEx3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException, IOException {
        Cat cat = new Cat(5,"Murka");
        Dog dog = new Dog(8,"Barak Obama","Black Boy");

        House house = new House();
        house.pets.add(dog);
        house.pets.add(cat);

        StringWriter writer = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(writer, house);
        System.out.println(writer.toString());
    }
}
