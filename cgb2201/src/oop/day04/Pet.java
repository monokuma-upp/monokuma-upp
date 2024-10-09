package oop.day04;

public class Pet {
    private String name;
    private int full;
    private int happy;

    public Pet(String name){
        this(name, 50, 50);
    }
    public Pet(String name, int full, int happy){
        this.name = name;
        this.full = full;
        this.happy = happy;
    }

    //喂食饱腹度加10，
    public void feed(){
        if(full == 100){
            System.out.println("已经饱了");
        }
        System.out.println("给" + name + "喂食：");
        full += 10;
        System.out.println(name + "的饱食度：" + full);
        System.out.println(name + "的快乐度：" + happy);
    }

    public void play(){
        if(full == 0){
            System.out.println("已经玩不动了，请喂食");
            return;
        }

        System.out.println("陪" + name + "玩耍");
        happy += 10;
        full -= 10;
        System.out.println(name + "的饱食度：" + full);
        System.out.println(name + "的快乐度：" + happy);
    }

    public void punish(){
        System.out.println("打" + name + "的屁屁" + "," + name + cry());
        happy -= 10;
        System.out.println("快乐度：" + happy);
    }

    public String cry(){
        return "哈哈哈哈";
    }

}
