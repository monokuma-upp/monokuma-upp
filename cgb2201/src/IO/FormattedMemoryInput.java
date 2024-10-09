package IO;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.EOFException;

public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try (
                DataInputStream in = new DataInputStream(
                        new ByteArrayInputStream(
                                BufferedInputFile.read(
                                        "D:\\cgb2201\\src\\ArrayList\\demo1.java")
                                        .getBytes()))   //接收一个字节数组
        ) {
            while (true)
                System.out.write((char) in.readByte());
        } catch (EOFException e) {
            System.out.println("\nEnd of stream");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



