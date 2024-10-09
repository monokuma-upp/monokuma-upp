package oop.day02.Computer;

public class Computer {

    public void open(){
        System.out.println("开机");
    }

    public void close(){
        System.out.println("关机");
    }

    public void useUsb(Usb usb){
        if(usb instanceof Mouse){
            Mouse m = (Mouse) usb;
            m.usbOpen();
            m.usbClose();
        }
        else if(usb instanceof Key){
            Key k = (Key) usb;
            k.usbOpen();
            k.usbClose();
        }
    }
}
