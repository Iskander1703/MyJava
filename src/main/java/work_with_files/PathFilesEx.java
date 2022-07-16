package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathFilesEx {
    public static void main(String[] args) throws IOException {
        Path filePath= Paths.get("/home/iskander/testFiles/PathFiles.txt");
        Path filePath2= Paths.get("test322");
        Path directoryPath= Paths.get("/home/iskander/testFiles/Papka");

        System.out.println("filePath.getFileName(): "+ filePath.getFileName());
        System.out.println("filePath2.getFileName(): "+ filePath2.getFileName());
        System.out.println("directoryPath.getFileName(): "+ directoryPath.getFileName());
        System.out.println("-----------------------------------");

        System.out.println("filePath.getRoot(): "+ filePath.getRoot());
        System.out.println("filePath2.getRoot(): "+ filePath2.getRoot());
        System.out.println("directoryPath.getRoot(): "+ directoryPath.getRoot());
        System.out.println("-----------------------------------");

        System.out.println("filePath.getParent(): "+ filePath.getParent());
        System.out.println("filePath2.getParent(): "+ filePath2.getParent());
        System.out.println("directoryPath.getParent(): "+ directoryPath.getParent());
        System.out.println("-----------------------------------");

        System.out.println("filePath.isAbsolute(): "+ filePath.isAbsolute());
        System.out.println("filePath2.isAbsolute(): "+ filePath2.isAbsolute());
        System.out.println("directoryPath.isAbsolute(): "+ directoryPath.isAbsolute());
        System.out.println("-----------------------------------");

        System.out.println("filePath.toAbsolutePath(): "+ filePath.toAbsolutePath());
        System.out.println("filePath2.toAbsolutePath(): "+ filePath2.toAbsolutePath());
        System.out.println("directoryPath.toAbsolutePath(): "+ directoryPath.toAbsolutePath());
        System.out.println("-----------------------------------");

        System.out.println("filePath2.toAbsolutePath(): "+ filePath2.toAbsolutePath());
        System.out.println("filePath2.toAbsolutePath().getParent(): "+ filePath2.toAbsolutePath().getParent());
        System.out.println("filePath2.toAbsolutePath().getRoot(): "+ filePath2.toAbsolutePath().getRoot());
        System.out.println("-----------------------------------");

        System.out.println("filePath.resolve(filePath2): "+ filePath.resolve(filePath2));
        System.out.println("-----------------------------------");

        Path anotherPath= Paths.get("/home/iskander/testFiles/Papka/odin/dva/tri");
        System.out.println("directoryPath.relativize(anotherPath): "+ directoryPath.relativize(anotherPath));
        System.out.println("-----------------------------------");

        if (!Files.exists(filePath)){
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if (!Files.exists(filePath2)){
            try {
                Files.createFile(filePath2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if (!Files.exists(directoryPath)){
            try {
                Files.createDirectories(directoryPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Files.isWritable(filePath): "+ Files.isWritable(filePath));
        System.out.println("Files.isReadable(filePath): "+ Files.isReadable(filePath));
        System.out.println("Files.isExecutable(filePath): "+ Files.isExecutable(filePath));
        System.out.println("-----------------------------------");

        Path filePath3 =Paths.get("/home/iskander/IdeaProjects/Test/test322");
        try {
            System.out.println("Files.isExecutable(filePath): "+ Files.isSameFile(filePath2, filePath3));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-----------------------------------");

        System.out.println("Files.size(filePath): "+ Files.size(filePath));
        System.out.println("Files.size(filePath2): "+ Files.size(filePath2));
        System.out.println("Files.size(directoryPath): "+ Files.size(directoryPath));
        System.out.println("-----------------------------------");

        System.out.println("Files.getAttribute(directoryPath, \"creationTime\"): "+
                Files.getAttribute(directoryPath, "creationTime"));
        System.out.println("-----------------------------------");

       Map<String, Object> map= Files.readAttributes(filePath2, "*");
       for (Map.Entry<String, Object> entry: map.entrySet()){
           System.out.println(entry.getKey()+ ": "+entry.getValue());
       }
        System.out.println("-----------------------------------");
    }
}
