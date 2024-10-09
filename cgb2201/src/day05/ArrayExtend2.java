package day05;
import java.util.Random;
public class ArrayExtend2 {
    public static void main(String[] args) {
        //定义一个长度为10的int[]数组，用Random对象的nextInt(100)方法生成10个随机数存入数组中，计算它们的平均值。
        int arr[] = new int[10];
        Random rd = new Random();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = rd.nextInt(100);
            sum+=arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("平均数：" + sum/arr.length);
    }
}
