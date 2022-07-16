package work_with_files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFIleTreeEx {
    public static void main(String[] args) throws IOException {
        Path source= Paths.get("/home/iskander/testFiles");
        Path destiny= Paths.get("/home/iskander/copyHere");
        CopyFIleTreeEx copyFIleTreeEx=new CopyFIleTreeEx();
        CopyFIleTreeEx.CopyFileVis copyFileVis= copyFIleTreeEx.new CopyFileVis(source, destiny);
        Files.walkFileTree(source, copyFileVis);


    }

    public class CopyFileVis extends SimpleFileVisitor<Path>{
        private Path source;
        private Path destiny;

        public CopyFileVis(Path source, Path destiny) {
            this.source = source;
            this.destiny = destiny;
        }

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            Path path=destiny.resolve(source.relativize(dir));
            Files.copy(dir,path,StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Произошло успешное копирование папки "+ dir+ " в "+path);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            Path path=destiny.resolve(source.relativize(file));
            Files.copy(file,path, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Произошло успешное копирование файла  "+ file+ " в "+path);
            return FileVisitResult.CONTINUE;
        }
    }
}

