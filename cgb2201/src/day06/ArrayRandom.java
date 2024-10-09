package day06;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayRandom {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] num = new int[30];
        for(int i = 0; i < num.length; i++){
            num[i] = rd.nextInt(100);
            System.out.print(num[i] +"\t");
        }
        System.out.println();
        System.out.println("最大值为：" + maxValue(num));
        System.out.println("最小值为：" + minValue(num));
        System.out.println("和为：" + sum(num));
        print(num);
    }
    //求数组的最大值
    public static int maxValue(int[] num){
        int max = num[0];
        for(int i = 1; i < num.length; i++){
            if(max < num[i]){
                max = num[i];
            }
        }
        return max;
    }
    public static int minValue(int[] num){
        int min = num[0];
        for(int i = 1; i < num.length; i++){
            if(min > num[i]){
                min = num[i];
            }
        }
        return min;
    }
    public static int sum(int[] num){
        int sum = 0;
        for(int i = 0; i < num.length; i++){
            sum += num[i];
        }
        return sum;
    }
    public static void print(int[] num){
        //先给数组排序
        Arrays.sort(num);
        System.out.println("从小到大排序：");
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + "\t");
        }
    }
    //获取最多出现次数的元素的值
    public static int mostAp(int[] num) {
        int[] countNum = new int[30]; //新建数组同来储存每个元素出现的次数，数组下标对应原数组的下标，返回最大值的那个就是出现次数最多的那个值
        //扫描num数组
        for(int i = 0; i < num.length; i++){
        }
        return 0;
    }
}
