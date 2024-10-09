package IO;
import java.io.*;
public class TestIn {
    public static void main(String[] args) {
        readByte();
        System.out.println("---------------");
        readChar();
        System.out.println("--------------");
        writeByte();
        System.out.println("------------------");
        writeChar();
    }

    public static void readByte(){
        InputStream in = null;
        try{
            //1.txt字节读取，高效字节输入流
           in = new BufferedInputStream(new FileInputStream("D:\\ready\\1.txt"));
           int b;
           while((b = in.read()) != -1){
               System.out.println(b);
           }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                in.close();//数据流关闭
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void readChar(){
        Reader in = null; //初始化字符流

        try{
            in = new BufferedReader(new FileReader("D:\\ready\\1.txt"));
            int b;
            while((b = in.read()) != -1){
                System.out.println(b);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                in.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void writeByte(){
        OutputStream out = null;
        try{
            out = new BufferedOutputStream(new FileOutputStream("D:\\ready\\1.txt"));
            out.write(97);
            out.write(97);
            out.write(97);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                out.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void writeChar(){
        Writer out = null;
        try{
            out = new BufferedWriter(new FileWriter("D:\\ready\\1.txt"));
            out.write(100);
            out.write(100);
            out.write(100);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                out.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
