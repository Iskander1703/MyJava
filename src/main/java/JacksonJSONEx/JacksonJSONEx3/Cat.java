package JacksonJSONEx.JacksonJSONEx3;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

public class Cat extends Pet
{
    public int age;

    public Cat(int age, String name) {
        this.name=name;
        this.age = age;
    }

    public Cat() {
    }
}
