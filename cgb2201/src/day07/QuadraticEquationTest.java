package day07;
import java.util.Random;
import java.util.Scanner;
public class QuadraticEquationTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入a的值:");
        double a = scan.nextDouble();
        System.out.println("请输入b的值:");
        double b = scan.nextDouble();
        System.out.println("请输入c的值:");
        double c = scan.nextDouble();
        QuadraticEquation q = new QuadraticEquation(a, b, c);

        if(q.getDiscriminant() > 0){
            System.out.println("这个程式有两个根:" + q.getRoot1() +" " + q.getRoot2());
        }
        else if(q.getDiscriminant() == 0){
            System.out.println("这个程式有一个根:" + q.getRoot1());
        }
        else{
            System.out.println("这个程式无根");
        }
    }
}
