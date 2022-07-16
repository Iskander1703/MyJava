package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("test100.txt");
//        if (!Files.exists(path)){
//            Files.createFile(path);
//        }
//
//        String string ="-Hello, Roman\n-Hello, Iskander\n-How are you?\n-I m fine and you?";
//        Files.write(path, string.getBytes());

       List<String> list=Files.readAllLines(path);

       for (String a: list){
           System.out.println(a);
       }
    }
}
