package day05;
import java.util.Scanner;
public class RECURSION {
    public static int fac(int num){
        if(num == 1){
            return 1;
        }
        return num*fac(num-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入一个数");
        int num = scan.nextInt();
        System.out.println(fac(num));
    }
}
