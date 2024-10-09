package Weekend;

public class Person extends Object{
    private String name;
    private int age;
    private String gender;

    public Person(){}

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString(){
        return "姓名: " + name + " 年龄: " + age + " 性别: " + gender;
    }
}
