package day05;
import java.util.Scanner;
public class PRACTISE4 {
    public static void main(String[] args) {
        /*
        要求用户输入一个0到2之间的整数，
        如果用户输入0输出“你出的是石头”，
        如果用户输入1就输出“你出的是剪刀”，
        如果用户输入的是2就输出“你出的是布”，
        然后再问是否要继续出拳，
        如果回答“y”就重复以上过程，
        否则结束程序。
         */
        Scanner scan = new Scanner(System.in);
        int num = 1;
        while(num > 0 && num < 2){
            System.out.println("请输入一个0到2的整数");
            num = scan.nextInt();
            switch(num){
                case 0:
                    System.out.println("你出的是石头");
                    break;
                case 1:
                    System.out.println("你出的是剪刀");
                    break;
                case 2:
                    System.out.println("你出的是布");
                    break;
                default:
                    break;
            }
            System.out.println("你是否要继续出拳 y/n");
            String ans = scan.next() ;
            if(ans.equals("y") || ans.equals("Y")){
                System.out.println("请输入一个0到2的整数");
                num = scan.nextInt();
            }
        }
    }
}
