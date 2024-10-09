package IO.ClassicDemo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

//递归实现输入任意目录，列出文件以及文件夹，效果看图
public class Demo2 {
    public static void main(String[] args) {
        List<File> list = Demo2.getAllFiles("D:");
        for(File f : list){
            System.out.println(f.getName());
        }
    }

    public static List<File> getAllFiles(String dir){
        List<File> files = new ArrayList<File>();
        File file = new File(dir);

        //文件必须存在&&并且要是文件夹
        if(file.exists() && file.isDirectory()){
            longErgodic(file,files);
        }
        return files;
    }

    public static void longErgodic(File file, List<File> files){
        File[] fillArr = file.listFiles();

        if(fillArr == null){
            return;
        }

        for(File file2 : fillArr){
            files.add(file2);
            longErgodic(file2, files);
        }
    }
}
