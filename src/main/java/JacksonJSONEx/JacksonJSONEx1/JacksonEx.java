package JacksonJSONEx.JacksonJSONEx1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JacksonEx {
    public static void main(String[] args) throws IOException, IOException {
        //создание объекта для сериализации в JSON
        Cat cat = new Cat();
        cat.name = "Murka";
        cat.age = 5;
        cat.weight = 4;

        //писать результат сериализации будем во Writer(StringWriter)
        Path path= Paths.get("test10.txt");
        FileWriter writer = new FileWriter(path.toFile());
        FileReader reader=new FileReader(path.toFile());


        //это объект Jackson, который выполняет сериализацию
        ObjectMapper mapper = new ObjectMapper();

        String result ="";
        // сама сериализация: 1-куда, 2-что
        mapper.writeValue(writer, cat);
      Cat cat1=  mapper.readValue(reader,Cat.class);
//        while (reader.ready()){
//           result+= (char)reader.read();
//        }
//        преобразовываем все записанное во StringWriter в строку

        System.out.println(result);
    }
}
