package work_with_files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DeleteFileTreeEx {
    public static void main(String[] args) {
        Path source= Paths.get("/home/iskander/copyHere");
        DeleteFileTreeEx deleteFileTreeEx=new DeleteFileTreeEx();
        DeleteFileTreeEx.DeleteFiles deleteFiles= deleteFileTreeEx.new DeleteFiles(source);
        try {
            Files.walkFileTree(source, deleteFiles);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public class DeleteFiles extends SimpleFileVisitor<Path> {
        private Path source;

        public DeleteFiles (Path source) {
            this.source = source;
        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            Files.delete(dir);
            System.out.println("Произошло успешное удаление папки "+ dir);
            return FileVisitResult.CONTINUE;
        }


        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            Files.delete(file);
            System.out.println("Произошло успешное удаление файла "+ file);
            return FileVisitResult.CONTINUE;
        }
    }
}


