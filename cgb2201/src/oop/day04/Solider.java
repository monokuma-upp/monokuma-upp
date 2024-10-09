package oop.day04;
import java.util.Random;

public class Solider {
    private int id;
    private  int blood;
    AK47 a;

    public Solider(AK47 a){
        this.a = a;
    }
    public Solider(int id, int blood){
        this.id = id;
        this.blood = blood;
    }

    public int getBlood(){
        return blood;
    }
    public void move(){
        System.out.println(this.id + "号士兵移动");
    }

    public void attack(){
        if(blood == 0){
            System.out.println(this.id + "号士兵死亡");
        }
        System.out.println(this.id + "号士兵进攻");

        if(a != null){
            a.fire();
        }

        int bloodMiss = new Random().nextInt(10);
        blood -= bloodMiss;

        if(blood < 0){
            blood = 0;
        }
    }
}
