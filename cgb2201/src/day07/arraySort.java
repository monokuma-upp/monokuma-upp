package day07;
import java.util.Arrays;
public class arraySort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() *100);
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        //升序排列
        System.out.println("升序排列:");
        for(int i : arr){
            System.out.println(i);
        }
        System.out.println("降序排列:");
        for(int j = arr.length - 1; j >= 0; j--){
            System.out.println(arr[j]);
        }
    }
}
