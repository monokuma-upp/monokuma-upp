package Exception;

import java.math.BigDecimal;

import java.math.BigInteger;

import java.util.Scanner;

public class demo4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数！");

        while (true) {
            String line = sc.nextLine();

            try {
                int num = Integer.parseInt(line);

                System.out.println(Integer.toBinaryString(num));

                break;

            } catch(Exception e) {
                try {
                    new BigInteger(line);

                    System.out.println("输入整数过大，请重新输入一个整数!");

                } catch (Exception e2) {
                    try {
                        new BigDecimal(line);

                        System.out.println("输入的是一个小数，请重新输入一个整数！");

                    } catch (Exception e1) {
                        System.out.println("输入的是非法字符，请重新输入一个整数。");

                    }

                }

            }

        }

    }

}
