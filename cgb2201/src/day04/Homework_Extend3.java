package day04;
import java.util.Scanner;
public class Homework_Extend3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = scan.nextInt();
        System.out.println("请输入月份：");
        int month = scan.nextInt();
        int day = 30;

            if(month == 4 || month ==6 || month== 9 || month == 11){
                System.out.println("一共：" + day);
            }
            else{
                day+=1;
                System.out.println(day);
            }
        }


        }



