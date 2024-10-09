package day04;

import java.util.Random;

public class ifDemo {
    public static void main(String[] args) {
        double price = 800.6;
        if(price >= 500) {
            price *=.8;
        }
        System.out.println("价格为" + price);
        int num = 21;
        if(num%3 == 0 && num%7 == 0) {
            System.out.println(num + "能同时被3和7整除");
        }
        /*
        if(num%2 == 0){
            System.out.println(num + "是偶数");
        }
        System.out.println("继续执行/是奇数");

        */

        /*
   1.if结构
   语法: if(boolean) {
   语句
   }
   2.执行过程
    */
    }

}
