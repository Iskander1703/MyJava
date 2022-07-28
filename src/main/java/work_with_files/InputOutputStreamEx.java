package work_with_files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class InputOutputStreamEx {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("nihua.txt", true);
        fileOutputStream.write("Ajara gudju".getBytes());
        PrintStream printStream=new PrintStream(fileOutputStream);
        System.setOut(printStream);
        System.out.println("Соси мой огромный хуй, Боби!");

    }
}
