package day05;
import java.util.Scanner;
public class PRACTISE7 {
    public static void main(String[] args) {
        //循环输入大于0的数字进行累加，直到输入的数字为0，就结束循环，并最后输出累加的结果。
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = scan.nextInt();
        int res = 0;
        while(num > 0 || num < 0){
            res += num;
            System.out.println("请继续输入一个整数");
            num = scan.nextInt();
        }
        System.out.println(res);
    }
}
