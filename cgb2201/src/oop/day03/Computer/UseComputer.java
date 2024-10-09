package oop.day03.Computer;

public class UseComputer {
    public static void useCom(IComputer computer, int one, int two){
        int res = computer.computer(one, two);
        System.out.println(res);
    }
}
