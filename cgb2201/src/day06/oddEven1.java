package day06;
import java.util.Scanner;
public class oddEven1 {
    public static void main(String[] args) {
        /*
        从键盘输入8个整数存放在一个数组中，然后将奇数和偶数分别存入到两个不同的数组中，
        并按奇数、偶数交替的顺序输出这两个数组中的所有数据（先交替输出，如果奇数个数多，
        则再输出剩下的奇数，如果偶数个数多，则再输出剩下的偶数）。（提示与要求：
        （1）定义一个数组存储从键盘输入的8个整数，先判断这8个整数中奇数和偶数的个数，才能定义存储奇数和偶数的数组的长度；
        （2）把一个大的数组分别存放在奇数和偶数数组中并交替输出的过程定义为方法）
         */
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[8];
        System.out.println("请输入8个整数：");
        //遍历输入8个整数到数组中
        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        Array(arr);
    }
    public static void Array(int[] array){
        //初始化两个数组粗存奇数和偶数
        int[] oddNum;
        int[] evenNum;
        //用两个计数器计算奇数和偶数的个数
        int oddCount = 0;
        int evenCount =0;
        //遍历数组计算奇数和偶数有多少个
        for(int j = 0; j < array.length; j++){
            //判定每一个元素是奇数还是偶数
            if(array[j] %2 ==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        //把计算得到的奇数和偶数的个数当作两个数组的长度
        oddNum = new int[oddCount];
        evenNum = new int[evenCount];
        //初始化两个变量e和o当作奇数偶数数组的计数器，遍历大数组时判断是奇数偶数就+1，把大数组的奇数存放到奇数数组，偶数存放到偶数数组
        //e和o的最终值应和oddCount和evenCount相同，但是e和o的作用是遍历计数
        int e = 0;
        int o = 0;
        for(int k = 0; k < array.length; k++){
            if(array[k] %2 ==0){
                evenNum[e] = array[k];
                e++;
            }
            else{
                oddNum[o] = array[k];
                o++;
            }
        }

    }
}
