package IO;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {
    public static void main(String[] args) throws IOException {
        //1.创建File类对象
        /*1.ready目录与1.txt需要自己手动创建
         * 2.File需要导包：import java.io.File;
         * 3.路径是String类型，必须写正确，不然找不到文件
         * 4.完整的文件名包含两部分：文件名+后缀名*/
        File file = new File("D:\\ready\\1.txt");
        System.out.println(file.length()); //17个字节
        System.out.println(file.exists());//是否存在
        System.out.println(file.isFile());//是否为文件
        System.out.println(file.isDirectory());//判断是否为文件夹
        System.out.println(file.getName());//获取文件名
        System.out.println(file.getParent());//获取父级路径
        System.out.println(file.getAbsolutePath());//绝对路径

        //2.2 测试创建与删除
        /*new 只会帮你在内存中创建一个File类型的对象
         * 并不会帮你在磁盘中创建一个真实存在的2.txt文件*/
        file = new File("D:\\ready\\2.txt");

        //创建一个之前不存在的文件2.txt,如果创建成功，会返回true
        /*如果指定创建文件的路径不对，会抛出异常：java.io.Exception
         * 所以需要提前处理这个问题，我们暂时选择在main()上抛出
         * 这个IO异常是目前我们遇到的强制要求必须预先处理的异常
         * 如果不处理，方法的调用会报错，通不过编译*/
        System.out.println(file.createNewFile());//创建之前不存在的文件

        file  = new File("D:\\ready\\3.txt");
        System.out.println(file.mkdir());//创建之前不存在的单层文件夹


    }
}
