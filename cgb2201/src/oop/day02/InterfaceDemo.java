package oop.day02;

import oop.day02.Computer.Computer;
import oop.day02.Computer.Mouse;
import oop.day02.Computer.Usb;
import oop.day02.Computer.Key;

public class InterfaceDemo {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.open();
        Usb u1 = new Mouse();
        c.useUsb(u1);
        Usb u2 = new Key();
        c.useUsb(u2);
        c.close();
    }
}
