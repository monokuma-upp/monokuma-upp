package oop.day01;

public class Student {
    String name;
    int age;
    String address;

    void sayHi(){
        System.out.println("大家好,我叫 " + name + " 今年我" + age + "岁了,我家住在 " + address);
    }
    void study(){
        System.out.println(name + " 在学习");
    }
}
