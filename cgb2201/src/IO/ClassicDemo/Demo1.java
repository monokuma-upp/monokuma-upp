package IO.ClassicDemo;
/*
（一） 在电脑D盘下创建一个文件为HelloWorld.txt文件，判断他是文件还是目录，在创建一个目
录IOTest,之后将HelloWorld.txt移动到IOTest目录下去；之后遍历IOTest这个目录下的文
件


（二） 递归实现输入任意目录，列出文件以及文件夹，效果看图


（三） 递归实现列出当前工程下所有.java文件


（四）从磁盘读取一个文件到内存中，再打印到控制台


（五） 在程序中写一个"HelloJavaWorld你好世界"输出到操作系统文件Hello.txt文件中


（六） 拷贝一张图片，从一个目录到另外一个目录下(PS:是拷贝是不是移动)


（七） 统计一个文件calcCharNum.txt（见附件）中字母'A'和'a'出现的总次数


（八）统计一个文件calcCharNum.txt（见附件）中各个字母出现次数：

A(8),B(16),C(10)...,a(12),b(10),c(3)....，括号内代表字符出现次数;


（九）统计一个文件calcCharNum2.txt（见附件）中各个字母出现次数：
A(8),B(16),C(10)...,a(12),b(10),c(3)....中(5),国(6)，括号内代表字符出现次数;


（十） 使用随机文件流类RandomAccessFile将一个文本文件倒置读出。


（十一） 编写一个Java应用程序，可以实现Dos中的type命令，并加上行号。

即将文本文件在控制台上显示出来，并在每一行的前面加上行号。


（十二）输入两个文件夹名称，将A文件夹内容全部拷贝到B文件夹，要求使用多线程来操作。


（十三）查看D盘中所有的文件和文件夹名称，并且使用名称升序降序，文件夹在前和文件夹在
后，文件大小排序等。


 */
import java.io.*;
public class Demo1 {
    public static void main(String[] args) {
        boolean isCreate;

        //创建新文件
        File file = new File("D:HelloWorld.txt");
        try{
            isCreate = file.createNewFile();
            if(isCreate){
                System.out.println("文件创建成功！");
            }
            else{
                System.out.println("文件创建失败，已存在");
            }
        }
        catch(IOException e){
            System.out.println("文件创建失败");
        }

        //判断他是文件还是目录
        if(file.isFile()){
            System.out.println("是文件");
        }
        else{
            System.out.println("这是一个目录");
        }

        //创建目录IOTest
        File dic = new File("D\\IOTest");
        dic.mkdirs();//创建目录

        //将HelloWorld.txt移动到IOTest目录下去
        if(file.renameTo(dic)){
            System.out.println("文件移动成功");
        }
        else{
            System.out.println("文件移动失败");
        }
    }



}
