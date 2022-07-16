package work_with_files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class WalkTreeEx {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("/home/iskander/testFiles");
        WalkTreeEx walkTreeEx=new WalkTreeEx();
        WalkTreeEx.FileVisitDirectoryImpl op=walkTreeEx.new FileVisitDirectoryImpl();
        Files.walkFileTree(path, op);

    }

    public class FileVisitDirectoryImpl implements FileVisitor<Path>{

        @Override
        public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
            System.out.println("Осуществляем вход в директорию: "+path);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
            System.out.println("Посетили файл с именем: "+path.getFileName());
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path path, IOException e) throws IOException {
            System.out.println("Ошибка посещения файла с именем: "+path.getFileName());
            return FileVisitResult.TERMINATE;
        }

        @Override
        public FileVisitResult postVisitDirectory(Path path, IOException e) throws IOException {
            System.out.println("Выходим из директории: "+path);
            return FileVisitResult.CONTINUE;
        }
    }
}
