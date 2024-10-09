package oop.day02.Computer;

public class Key implements Usb{

    @Override
    public void usbOpen(){
        System.out.println("打开键盘usb");
    }

    public void usbClose(){
        System.out.println("关闭键盘usb");
    }
}
