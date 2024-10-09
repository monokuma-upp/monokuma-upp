package StringBuffer;
import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println("转为字符串：" + arrayToString(arr));
        System.out.println("翻转：" + reverse(arrayToString(arr)));
    }

    public static String arrayToString(int[] arr){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1){
                sb.append(arr[i]);
                continue;
            }
            sb.append(arr[i] + ", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static String reverse(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        return sb.toString();
    }
}
