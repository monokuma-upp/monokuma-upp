package StringBuffer;
import java.util.Scanner;

//编写测试类，输入一个标准的网址，输出其域名的主体；
//
//将该主体转换为大写，打印输出；
//
//具体输出要求请看测试说明。
//
//测试说明
//补充完代码后，点击测评，平台会对你编写的代码进行测试，当你的结果与预期输出一致时，即为通过。
//
//测试输入：
//
//https://www.educoder.net/
//
//预期输出：
//
//educoder
//EDUCODER

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        String s = new Scanner(System.in).next();
        System.out.println(s);
        System.out.println(findObjective(s));
    }

    public static String findObjective(String s){
        StringBuffer sb = new StringBuffer(s);
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == '.'){
               sb.delete(0, i + 1);
               break;
            }
        }
        for(int j = sb.length() - 1; j > 0; j--){
            if(sb.charAt(j) == '.'){
                sb.delete(j, sb.length());
            }
        }
        return sb.toString();
    }
}
