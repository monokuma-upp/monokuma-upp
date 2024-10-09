package oop.day02.Computer;

public class Mouse implements Usb {
    @Override
    public void usbOpen(){
        System.out.println("打开鼠标usb");
    }

    @Override
    public void usbClose(){
        System.out.println("关闭鼠标usb");
    }
}
