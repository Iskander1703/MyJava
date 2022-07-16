package JacksonJSONEx.JacksonJSONEx2;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@JsonAutoDetect
public class Cat {
    public String name;
    @JsonDeserialize(as = LinkedList.class)
//    @JsonDeserialize(as = ArrayList.class)
    public List<Cat> cats;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", cats=" + cats +
                '}';
    }
}
