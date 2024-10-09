package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
写一个方法void triangle(int a,int b,int c)，判断三个参数是否能构成一个三角形。
如果不能则抛出异常IllegalArgumentException，显示异常信息：“a,b,c不能构成三角形”；
如果可以构成则显示三角形三个边长。在主方法中得到命令行输入的三个整数，调用此方法，并捕获异常。

 */
public class demo2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            Triangle.triangle(a,b,c);
        }
        catch(InputMismatchException e){
            System.out.println("请输入整数作为三角形的边长！");
        }
        catch(IllegalArgumentException e){
            System.out.println("a,b,c不能构成三角形");
        }
    }
}
class Triangle{
    static void triangle(int a, int b, int c) throws IllegalArgumentException, InputMismatchException{
        if(a < 0 || b < 0 || c < 0 || a + b <= c || a + c <= b || b + c <= a){
            throw new IllegalArgumentException();
        }
        System.out.printf("三角形的三边长为：%d,%d,%d\n",a,b,c);
    }
}

