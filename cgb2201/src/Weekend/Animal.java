package Weekend;
//建一个动物类
public class Animal {
    private String name;
    private int age;
    private String color;
//创建无参构造方法
    public Animal(){ }

//创建有参构造方法定义动物名字,年龄,颜色
    public Animal(String name, int age, String color){
        this.name = name;
        this.age  = age;
        this.color = color;
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void sayHi(){
        System.out.println("dadadad");

    }

}

 class Dog extends Animal{
    public Dog(){

    }

}

class AnimalTest{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sayHi();
    }
}
