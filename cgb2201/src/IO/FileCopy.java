package IO;

import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        System.out.println("请输入源文件路径");//--被复制的那个文件);
        String f = new Scanner(System.in).nextLine();////要复制的文件的路径
        System.out.println("请输入新文件路径：");//--复制好的新文件
        String t = new Scanner(System.in).nextLine();

        copyOfFileChar(f,t);
    }

    public static void copyOfFile(String f, String t){ //参数给定要复制的文件路径和复制过后新文件的路径
        InputStream in = null;
        OutputStream out = null;

        try{
            in = new BufferedInputStream(new FileInputStream(f));
            out = new BufferedOutputStream(new FileOutputStream(t));

            int b;//定义变量来保存读到的数据
            while((b = in.read()) != -1){//如果文件不为空
                out.write(b);//直接将读到的文件写入新的文件
            }
            System.out.println("文件复制成功！");
        }
        catch(Exception e){
            System.out.println("很抱歉，文件复制失败");
            e.printStackTrace();
        }
        finally{
            try{
                out.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            try{
                in.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    //使用字符流复制文件
    public static void copyOfFileChar(String f,String t){
        Reader in = null;
        Writer out = null;

        try{
            in = new BufferedReader(new FileReader(f));
            out = new BufferedWriter(new FileWriter(t));
            int a;
            while((a = in.read()) != -1){
                out.write(a);
            }
            System.out.println("文件复制成功");
        }
        catch(Exception e){
            System.out.println("对不起，没有复制到文件");
            e.printStackTrace();
        }
        finally{
            try{
                out.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            try{
                in.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
