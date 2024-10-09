package oop.day04;
import java.util.Random;
import java.util.Random;
import java.util.Scanner;

public class PetTest {
    public static void main(String[] args) {
        System.out.println("请选择是猫还是狗（1/2）：");
        int num = new Scanner(System.in).nextInt();
        if(num < 1 || num > 2){
            System.out.println("请输入正确的数字");
        }

        if(num == 1){
            System.out.println("请输入猫猫的名字：");
            String name = new Scanner(System.in).next();
            Cat cat = new Cat(name);
            cat.feed();
            cat.play();
            cat.punish();
        }
        else{
            System.out.println("请输入狗狗的名字：");
            String name1 = new Scanner(System.in).next();
                Dog dog  = new Dog(name1);
                dog.feed();
                dog.feed();
                dog.play();
                dog.play();
                dog.punish();
        }
    }
}
