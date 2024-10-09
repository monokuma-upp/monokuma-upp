package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
//随机验证码。
//
//随机生成十组六位字符组成的验证码。
//
//验证码由大小写字母、数字字符组成。
public class Vertification {
    public static void main(String[] args) {
        //定义一个char数组用来储存大写，小写，数字26+26+10
        char[] arr = new char[26+26+10];
        //前10位存数字，后面26位存大写，最后26位存小写
        for(int i = 0; i < arr.length; i++){
            if(i < 10){
                arr[i] = (char)(i + 48);
            }
            else if(i < 10 + 26){
                arr[i] = (char)(i + 65 - 10);
            }
            else{
                arr[i] = (char)(i + 97  - 10 -26);
            }
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i = 0 ; i < 10; i++){
            String str = "";
            for(int j = 1; j <= 6; j++){
                str += arr[new Random().nextInt(arr.length)];
            }
            list.add(str); //拼接字符串
        }
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("随机验证码：" + iterator.next());
        }
    }
}
