package work_with_files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file=new File("/home/iskander/testFiles/test1.txt");
        File folder=new File("/home/iskander/testFiles/opachki");
        File file2=new File("salam-alekum.txt");
        File file3=new File("/home/iskander/testFiles/test35.txt");
        File folder2=new File("/home/iskander/testFiles/achyn");


        System.out.println("file.getAbsolutePath(): "+ file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath(): "+ folder.getAbsolutePath());
        System.out.println("file2.getAbsolutePath(): "+ file2.getAbsolutePath());
        System.out.println("-------------------------------------------------");

        System.out.println("file.isAbsolute(): "+ file.isAbsolute());
        System.out.println("folder.isAbsolute(): "+ folder.isAbsolute());
        System.out.println("file2.isAbsolute() "+ file2.isAbsolute());
        System.out.println("-------------------------------------------------");

        System.out.println("file.isDirectory(): "+ file.isDirectory());
        System.out.println("folder.isDirectory(): "+ folder.isDirectory());
        System.out.println("file2.isDirectory(): "+ file2.isDirectory());
        System.out.println("-------------------------------------------------");

        System.out.println("file.exists(): "+ file.exists());
        System.out.println("folder.exists(): "+ folder.exists());
        System.out.println("file2.exists(): "+ file2.exists());
        System.out.println("file3.exists(): "+ file3.exists());
        System.out.println("folder2.exists(): "+ folder2.exists());
        System.out.println("-------------------------------------------------");


        System.out.println("file3.createNewFile(): "+ file3.createNewFile());
        System.out.println("folder2.mkdir(): "+ folder2.mkdir());
        System.out.println("-------------------------------------------------");

        System.out.println("file.length(): "+ file.length());
        System.out.println("folder.length(): "+ folder.length());
        System.out.println("file2.length(): "+ file2.length());
        System.out.println("file3.length(): "+ file3.length());
        System.out.println("folder2.length(): "+ folder2.length());
        System.out.println("-------------------------------------------------");

        System.out.println("file3.delete(): "+ file3.delete());
        System.out.println("folder2.delete(): "+ folder2.delete());
        System.out.println("folder.delete(): "+ folder.delete());
        System.out.println("-------------------------------------------------");

        List<File> fileList= List.of(folder.listFiles());
        System.out.println("folder.listFiles(): "+ fileList);
        System.out.println("-------------------------------------------------");


        System.out.println("folder.isHidden: "+ folder.isHidden());
        System.out.println("folder.canRead: "+ folder.canRead());
        System.out.println("folder.canWrite: "+ folder.canWrite());
        System.out.println("folder.canExecute: "+ folder.canExecute());
        System.out.println("-------------------------------------------------");




    }
}
