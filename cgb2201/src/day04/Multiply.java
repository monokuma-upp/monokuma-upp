package day04;
import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入乘法数字：");
        int num = scan.nextInt();
        int i = 1;
        while(i <= num){
            System.out.println(i + "*9" + "=" + i*num);
            i += 1;
        }
    }
}
