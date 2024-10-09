package StringBuilder;
import java.util.Scanner;

//输入一个字符串，统计大写、小写、数字、其他字符各有多少个。
public class CountString {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        String s = new Scanner(System.in).next();
        int[] count = new int[4];//第一位存大写，第二位小学，第三位数字，第四位字符
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                count[0] ++;
            }
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                count[1]++;
            }
            else if(s.charAt(i) >= 0 && s.charAt(i) < 10){
                count[2] ++;
            }
            else{
                count[3] ++;
            }
        }
        System.out.println("大写：" + count[0] + " 小写：" + count[1] + " 数字：" + count[2] + " 字符：" + count[3]);
    }
}
