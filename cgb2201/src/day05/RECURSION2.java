package day05;

import java.util.Scanner;

public class RECURSION2 {
    public static void print(int n){
        if(n < 10){
            System.out.println(n);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入一个数");
        int num = scan.nextInt();
        System.out.println();
    }
}
