package oop.day04;
import java.util.Scanner;
import java.util.Random;

public class AK47 {
    private int bullet = 100;

    public AK47(){}

    public void fire(){
        if(bullet == 0){
            System.out.println("out of ammo");
            return;
        }

        //随机发射子弹，如果子弹大于发射数，则一直发射，不然则停止发射提示没有子弹了
        int projectile = new Random().nextInt(10);
        //最后几发的时候有多少发射多少发
        if(projectile > bullet){
            projectile = bullet;
        }
        bullet -= projectile;

        for(int i = 0; i < bullet; i++){
            System.out.println("突");
        }
        System.out.println("--");
        if(bullet == 0){
            System.out.println("子弹打完了");
            reload();
        }
    }

    public void reload(){
        System.out.println("请输入你要装填的子弹数：");
        int loadAmount = new Scanner(System.in).nextInt();
        bullet += loadAmount;
        System.out.println("已装填" + bullet + "发子弹");
    }


}
