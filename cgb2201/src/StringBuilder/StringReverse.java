package StringBuilder;
import java.util.Scanner;

//把arr[]数组，转换成字符串用 【4，5，6，7，8，9】格式输出。
//输入一个字符串，并反转。
public class StringReverse {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        String s = new Scanner(System.in).next();
        char[] num = new char[s.length()];
        for(int i = 0; i < num.length; i++){
            num[i] = s.charAt(i);
        }
        //开始数组反转（新建一个数组的方法反转）
        char[] reverse = new char[num.length];
        for(int i = 0; i < reverse.length; i++){
            reverse[i] = num[num.length - 1 - i];
        }
        System.out.println("新建数组的排序：" + toString(reverse));

        //数组反转，不生成新的数组，在原数组上修改算法
        if(num.length % 2 != 0) {
            for (int j = 0, k = num.length - 1; j < num.length / 2 && k > num.length / 2; j++, k--) {
                char temp = num[j];
                num[j] = num[k];
                num[k] = temp;
            }
        }
        if(num.length % 2 == 0) {
            for (int j = 0, k = num.length - 1; j < num.length  / 2 + 1 && k > num.length  / 2 - 1; j++, k--) {
                char temp = num[j];
                num[j] = num[k];
                num[k] = temp;
            }
        }

        System.out.println("排序过后的数组：" + toString(num));
    }

    public static String toString(char[] c){
        String s = "[";
        for(int i = 0; i < c.length; i++){
           s += c[i] + " ";
        }
        s += "]";
        return s;
    }
}
