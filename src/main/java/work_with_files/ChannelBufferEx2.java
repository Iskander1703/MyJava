package work_with_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx2 {
    public static void main(String[] args) {
        File file=new File("test10.txt");

        try (RandomAccessFile randomAccessFile=new RandomAccessFile(file, "rw");
        FileChannel fileChannel=randomAccessFile.getChannel()){

            ByteBuffer byteBuffer=ByteBuffer.allocate(5);
            fileChannel.read(byteBuffer);
            byteBuffer.flip();
            System.out.println((char)byteBuffer.get());
            System.out.println((char)byteBuffer.get());
            System.out.println((char)byteBuffer.get());
            System.out.println((char)byteBuffer.get());
            System.out.println((char)byteBuffer.get());
            byteBuffer.rewind();
            System.out.println((char)byteBuffer.get());
            System.out.println("--------------------------------------");

            byteBuffer.compact();
            fileChannel.read(byteBuffer);
            byteBuffer.flip();
            System.out.println((char)byteBuffer.get());
            System.out.println((char)byteBuffer.get());
            System.out.println((char)byteBuffer.get());
            System.out.println((char)byteBuffer.get());
            System.out.println((char)byteBuffer.get());
            System.out.println("--------------------------------------");

            byteBuffer.clear();
            fileChannel.read(byteBuffer);
            byteBuffer.flip();
            System.out.println((char)byteBuffer.get());
            byteBuffer.mark();
            System.out.println((char)byteBuffer.get());
            System.out.println((char)byteBuffer.get());
            byteBuffer.reset();
            while (byteBuffer.hasRemaining()){
                System.out.println((char)byteBuffer.get());
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
