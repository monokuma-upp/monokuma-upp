package day06;
import java.util.Arrays;
//求数组元素最大值，并将最大值放在最后一个元素的下一个位置
public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100);
            System.out.println(arr[i]);
        }
        int max = arr[0],min = arr[0];

        for(int j = 1; j < arr.length; j++){
            if(max < arr[j]){
                max = arr[j];
            }
            else if(min > arr[j]){
                min = arr[j];
            }
        }
        System.out.println("最大值是：" + max);
        System.out.println("最小值是：" + min);

        arr = Arrays.copyOf(arr,arr.length + 1); //先扩容
        arr[arr.length - 1] = max; //将max赋值给最后一个元素
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
