package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {

    public static void main(String[] args) {
        try(RandomAccessFile randomAccessFile=new RandomAccessFile("/home/iskander/testFiles/randomAccessFileEx.txt", "rw")){
            int a=randomAccessFile.read();
            System.out.print((char) a);

            int b=randomAccessFile.read();
            System.out.print((char) b);

            int c=randomAccessFile.read();
            System.out.println((char) c);

            randomAccessFile.seek(101);
            System.out.println(randomAccessFile.readLine());

            randomAccessFile.seek(randomAccessFile.length()-1);
            randomAccessFile.writeBytes("\n\t\t\t\tRobert Lee Frost");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
