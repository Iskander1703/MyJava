package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx {

    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile =
                     new RandomAccessFile("/home/iskander/testFiles" +
                             "/opachki/randomAccessFileEx.txt", "rw");
             FileChannel channel = randomAccessFile.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(11);
            StringBuilder text = new StringBuilder();

            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                System.out.println("Read: " + byteRead + " bytes");
                buffer.flip();

                while (buffer.hasRemaining()) {
                    text.append((char) buffer.get());
                }

                buffer.clear();
                byteRead = channel.read(buffer);
            }

            System.out.println(text);

            String text2="\nThere are only two ways to live your life.\n " +
                    "One is as though nothing is a miracle.\n " +
                    "The other is as though everything is a miracle.";

//            ByteBuffer buffer1=ByteBuffer.allocate(text2.getBytes().length);
//            buffer1.put(text2.getBytes());
//            buffer1.flip();
//            channel.write(buffer1);
            ByteBuffer buffer1=ByteBuffer.wrap(text2.getBytes());
            channel.write(buffer1);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
