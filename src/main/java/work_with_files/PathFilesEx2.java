package work_with_files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath2= Paths.get("test322");
        Path directoryPath= Paths.get("/home/iskander/testFiles/Papka");

//        try {
////            Files.copy(filePath2, directoryPath.resolve(filePath2));
////            Files.copy(filePath2, directoryPath.resolve("test333.txt"));
//            Files.copy(filePath2, directoryPath.resolve(filePath2), StandardCopyOption.REPLACE_EXISTING);
//            System.out.println("Done!");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        Path filePath=Paths.get("aboba.txt");
//        try {
//            Files.move(filePath, directoryPath.resolve(filePath));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


//        Files.move(filePath2, filePath2.toAbsolutePath().getParent().resolve("opachki.txt"));

        Files.delete(Paths.get("opachki.txt"));

    }
}
