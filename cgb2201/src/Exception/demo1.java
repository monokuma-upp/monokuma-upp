package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            System.out.println(10 - n);
        }
        catch(InputMismatchException e){
            System.out.println("not int");
        }
        finally{
            System.out.println("end");
        }
    }
}
