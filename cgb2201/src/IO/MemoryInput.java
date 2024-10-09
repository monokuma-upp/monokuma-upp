package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read("D:\\cgb2201\\src\\ArrayList\\demo1.java"));
        int c;
        while((c = in.read()) != -1){
            System.out.print((char) c);
        }
    }
}
