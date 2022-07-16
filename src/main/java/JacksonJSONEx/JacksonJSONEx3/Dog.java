package JacksonJSONEx.JacksonJSONEx3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


public class Dog extends Pet
{
    public int age;
    public String owner;

    public Dog() {
    }

    public Dog(int age, String owner, String name) {
        this.age = age;
        this.owner = owner;
        this.name=name;
    }
}




