package Generics;

public class AppleTest {
    public static void main(String[] args) {
        Apple<Integer> apple1 = new Apple<Integer>(35);
        System.out.println(apple1.toString());

        Apple<Double> apple2 = new Apple<Double>(35.0);
        System.out.println(apple2.toString());

        Apple<String> apple3 = new Apple<String>("35克");
        System.out.println(apple3.toString());
    }
}
