package day04;
import java.util.Scanner;
public class CommandBySwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数字：");
        int command = scan.nextInt();
        switch(command){
            case 1:
                System.out.println("111");
                break;
            case 2:
                System.out.println("222");
                break;
            case 3:
                System.out.println("333");
                break;
            case 4:
                System.out.println("444");
                break;
            default:
                System.out.println("666");
        }
    }
}
