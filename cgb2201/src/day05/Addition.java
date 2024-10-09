package day05;
import java.util.Scanner;
import java.util.Random;
public class Addition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();
        int score = 0;
        int result = 0;
        for (int  i = 1; i < 10; i++){
            //1.出题 2.答题 3.叛题
            int num1 = rd.nextInt(100);
            int num2 = rd.nextInt(100);
            System.out.println("(" + i + ")" + num1 + "+" + num2 + "=?");
            System.out.println("算吧");
            result = scan.nextInt();
            if(result == (num1+num2)){
                System.out.println("答对了");
                score += 10;
            }
            else{
                System.out.println("答错了");
            }
        }
        System.out.println("总分为" + score);
    }
}
