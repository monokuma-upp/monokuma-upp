package IO.ClassicDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {
    public static void main(String[] args) {
        File fileFrom = new File("D:/mm.jpg");
        File fileTo = new File("D:/cgb2201/mm.jpg");

        try{
            if(!fileTo.createNewFile()){ //如果没有目标地址没有创建文件
                System.out.println("创建文件失败");
            }
            FileInputStream in = new FileInputStream(fileFrom);
            FileOutputStream out = new FileOutputStream(fileTo);

            int len = 0;
            byte[] buff = new byte[1024];

            while((len = in.read(buff)) != -1){
                out.write(buff, 0, len);
            }

            out.flush();

            in.close();
            out.close();

            System.out.println("文件复制成功");

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
