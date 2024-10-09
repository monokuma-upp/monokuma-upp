package day05;
import java.util.Scanner;
import java.util.Random;
public class ArrayExtend {
    public static void main(String[] args) {
        int arr[] = new int[20];
        Random rd = new Random();
        int sum = 0;
        int max = 0;
        int min = 0;
        for(int i = 0; i < arr.length; i++){
            //将随机20个整数存入数组
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i]);
            //计算总和
            sum +=arr[i];
        }
        for(int j = 0; j < arr.length; j++){
            /*
            计算最大值
            遍历数组，max初始化值为0.用每一个元素与max比较。如果元素大于max则赋值给max一以此类推
             */
            if(arr[j] > max){
                max = arr[j];
            }
        }
        min = max;
        for(int k = 0; k < arr.length; k++){
            /*
            计算最大值
            遍历数组，将最大值赋值给min，最大值与每一个元素比较，然后比出最小
             */
            if(arr[k] < min){
                min = arr[k];
            }
        }
        System.out.println("总和为：" + sum);
        System.out.println("最大值"+max);
        System.out.println("最小值"+min);
    }
}
