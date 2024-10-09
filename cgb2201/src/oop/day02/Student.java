package oop.day02;

public class Student {
    //成员变量
    String name;
    int age;
    String address;

    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }//构造方法

    void sayHi(){
        System.out.println("大家好,我叫 " + name + " 今年我" + age + "岁了,我家住在 " + address);
    }
    void study(){
        System.out.println(name + " 在学习");
    }
}
