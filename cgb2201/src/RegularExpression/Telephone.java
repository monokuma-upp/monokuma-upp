package RegularExpression;

import java.util.Scanner;
public class Telephone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机好：");
        String s = sc.nextLine();

        String regex = "1[30]\\d{10}";
        boolean flag = s.matches(regex);
        System.out.println("flag：" + flag);
    }

}
