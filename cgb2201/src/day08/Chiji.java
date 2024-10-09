package day08;

import java.util.Arrays;
class ChiJi{
    public static void main(String[] args){
        Player p1=new Player("小明");
        Player p2=new Player("老王");
        Clips clips=new Clips();
        for(int i=1;i<=20;i++){
            p1.zhuangDan(clips,new Bullent());
        }
        Gun gun=new Gun();
        p1.takeGun(gun);
        p1.shangTang(clips);
        for(int i=1;i<=30;i++){
            p1.kaiQiang(p2);
            if(p2.HP<=0){
                break;
            }
        }
        System.out.println("死亡");
        System.out.println(p2.HP);
    }
}
/*
类	玩家 Player
	属性 昵称 name
		 血量 HP
		 枪 gun
	行为 捡枪（枪）
		 装弹（弹夹，子弹）
		 上膛（弹夹）
		 开枪（玩家）
		 掉血（伤害值）
*/
class Player{
    String name;
    int HP;
    Gun gun;
    public Player(String name){
        this.name=name;
        this.HP=100;
        this.gun=null;
    }
    public void takeGun(Gun gun){
        this.gun=gun;
    }
    public void zhuangDan(Clips clips,Bullent bullent){
        clips.loding(bullent);
    }
    public void shangTang(Clips clips){
        gun.takeClips(clips);
    }
    public void kaiQiang(Player enemy){
        gun.shoot(enemy);
    }
    public void diaoXue(int damage){
        HP-=damage;
    }
}
/*
类	枪
	属性 弹夹 clips
	行为 装弹夹=Player上膛（弹夹）
		 开枪(玩家)
*/
class Gun{
    Clips clips;
    public void takeClips(Clips clips){
        this.clips=clips;
    }
    public void shoot(Player enemy){
        Bullent bullent=clips.out();
        if(bullent==null){
            System.out.println("放了 一个空枪");
        }else{
            bullent.hit(enemy);
        }
    }

}
/*
类  弹夹
	属性 子弹 bullent
	行为 装弹（子弹）
		 出弹（）
*/
class Clips{
    Bullent[] bullents=new Bullent[0];
    int maxSize=30;
    public void loding(Bullent bullent){
        if(bullents.length>=maxSize){
            System.out.println("弹夹已满");
        }else{
            bullents=Arrays.copyOf(bullents,bullents.length+1);
            bullents[bullents.length-1]=bullent;
        }
    }
    public Bullent out(){
        Bullent bullent;
        if(bullents.length>0){
            bullent=bullents[bullents.length-1];
            bullents=Arrays.copyOf(bullents,bullents.length-1);
            return bullent;
        }else{
            System.out.println("没有子弹了！！！");
            return null;
        }
    }

}
/*
类	子弹
	属性 伤害值 damage
	行为
		命中 hit(玩家)
*/
class Bullent{
    int damage=10;
    public void hit(Player enemy){
        enemy.diaoXue(damage);
    }
}
