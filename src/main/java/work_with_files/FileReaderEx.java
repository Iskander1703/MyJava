package work_with_files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

    public static void main(String[] args) {
        FileReader fileReader=null;
        try {
            fileReader=new FileReader("/home/iskander/testFiles/test1.txt");
            int character;
            while((character=fileReader.read())!=-1){
                System.out.print((char)character);

            }
            System.out.println();
            System.out.print("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
