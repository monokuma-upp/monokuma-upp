package day04;
import java.util.Scanner;
public class Homework_Extend2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = scan.nextInt();
        if(num < 0){
            System.out.println("-");
        }
        else if(num > 0){
            System.out.println("+");
        }
        else{
            System.out.println("0");
        }
    }
}
