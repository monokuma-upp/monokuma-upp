package day05;
import java.util.Scanner;
import java.util.Random;
public class GUESSING {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();
        int rdNumber = rd.nextInt(100);
        System.out.println("开始猜数字吧从1-100");
        int num = scan.nextInt();
        while(num != rdNumber) {
            while(num < 0 || num > 100){
                System.out.println("请输入正确范围的数字");
                num = scan.nextInt();//for(;;) while true死循环
            }
            if (num > rdNumber) {
                System.out.println("太大了");
            } else{
                System.out.println("太小了");
            }
            System.out.println("继续猜吧");
            num = scan.nextInt();
        }
        System.out.println("bingo");
    }
}
