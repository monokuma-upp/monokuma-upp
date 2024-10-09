package day06;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        /*
        从键盘输入8个整数存放在一个数组中，然后将奇数和偶数分别存入到两个不同的数组中，
        并按奇数、偶数交替的顺序输出这两个数组中的所有数据（先交替输出，如果奇数个数多，
        则再输出剩下的奇数，如果偶数个数多，则再输出剩下的偶数）。（提示与要求：
        （1）定义一个数组存储从键盘输入的8个整数，先判断这8个整数中奇数和偶数的个数，才能定义存储奇数和偶数的数组的长度；
        （2）把一个大的数组分别存放在奇数和偶数数组中并交替输出的过程定义为方法）
         */
        Scanner scan = new Scanner(System.in);
        int arr1[] = new int[8];
        System.out.println("请输入8个整数:");

        for(int i = 0; i < arr1.length; i++){
            arr1[i] = scan.nextInt();
        }
        Array(arr1);
    }
    public static void Array(int[] array){
        int[] oddNum;
        int[] evenNum;
        //创建一个奇数数组和偶数数组用来储存
        int oddCount = 0;
        int evenCount = 0;
        //创建奇数偶数计数器计算有多少个以此来确定数组长度
        for(int i = 0; i < array.length; i++){
            if(array[i] %2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        //遍历给定数组来计算奇数偶数的个数
        oddNum = new int[oddCount];
        evenNum = new int[evenCount];
        //重新初始化两个数组
        int e = 0;
        int o = 0;
        //把array中的奇数偶数分别放到两个数组中
        for(int j = 0; j < array.length; j++){
            if(array[j] %2 ==0){
                evenNum[e] = array[j];
                e++;
            }
            else{
                oddNum[o] = array[j];
                o++;
            }
        }
        //交替输出，如果偶数比奇数多，先交替输出奇数然后再输出剩下的偶数
        //奇数比偶数多，先交替输出偶数然后再输出剩下的奇数
        if(evenNum.length > oddNum.length){
            for(int l = 0; l < oddNum.length; l++){
                System.out.print(oddNum[l] + " " + evenNum[l] + " ");
            }
            //先交替输出奇数和偶数
            for(int k = oddNum.length; k < evenNum.length; k++){
                System.out.print(evenNum[k] + " ");
                //输出剩下的偶数
            }
        }
        else{
            for(int n = 0; n < evenNum.length; n++){
                System.out.print(evenNum[n] + " " + oddNum[n] + " ");
            }
            //先交替输出奇数和偶数
            for(int m = evenNum.length; m < oddNum.length; m++){
                System.out.print(oddNum[m] + " ");
                //输出剩下的偶数
            }
        }
    }
}
