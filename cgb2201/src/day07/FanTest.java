package day07;
import java.util.Scanner;
public class FanTest {
    public static void main(String[] args) {
        Fan fan = new Fan();

        /*
        设置风扇1的状态
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");

        设置风扇2的状态
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");

        System.out.println(fan1.toString(true));
        System.out.println(fan2.toString(false));
         */
        Scanner scan = new Scanner(System.in);
        while(true){
            int i;
            boolean flag = false;
            System.out.println("请输入开关0或者1 :");
            i = scan.nextInt();
            if(i == 1){
                flag = true;
                fan.setOn(flag);
                System.out.println(fan.toString(fan.getOn()));
                break;
            }
            else if(i == 0){
                fan.setOn(flag);
                System.out.println(fan.toString(fan.getOn()));
                break;
            }
            else{
                System.out.println("请重新输入");
            }
        }
    }
}