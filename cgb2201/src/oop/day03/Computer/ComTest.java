package oop.day03.Computer;

public class ComTest {
    public static void main(String[] args) {
        UseComputer.useCom(new Add(), 12,6);
        UseComputer.useCom(new Minus(), 12,6);
        UseComputer.useCom(new Multiply(), 12,6);
        UseComputer.useCom(new Divide(), 12,6);
    }
}
