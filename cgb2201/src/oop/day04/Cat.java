package oop.day04;
//需求：设计宠物类，用户可以自由选择养猫还是养狗，可以给宠物起名字，还可以实现喂食互动的功能，宠物需要有饱食度和快乐度
public class Cat extends Pet{

    public Cat(String name, int full, int happy){
        super(name, full ,happy);
    }

    public Cat(String name){
        super(name);
    }

    @Override
    public String cry(){
        return "瞄";
    }
}
