package day06;
import java.util.Scanner;
public class occurTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[8];
        int count = 0; //用来计算每个整数出现的次数
        System.out.println("Enter the integer between 1 and 100:");
        //用数组记录输入的整数
        for(int i = 0; i < 8; i++){
            num[0] = scan.nextInt();
        }
        //新建一个数组，用来记录1到100的整数
        int[] arr = new int[100];
        for(int i = 0; i < 100; i++){
            arr[i] = i;
        }
        //让num中的每一个元素遍历arr数组，出现次数用计数器count来计算
    }
}
