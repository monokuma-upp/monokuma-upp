package ArrayList;
import java.util.ArrayList;


public class demo2 {
    public static void main(String[] args) {

        ArrayList<Student> arr = new ArrayList<>();
        Student s1 = new Student("jim",22);
        Student s2 = new Student("eric",19);
        Student s3 = new Student("aliy",24);
        Student s4 = new Student("mike",21);

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);

        //遍历列表
        for(int i = 0; i < arr.size(); i++){
            System.out.println("学生名字:" + arr.get(i).getName() + " " + "学生年龄:" + arr.get(i).getAge());
        }
    }
}

class Student{
    private String name;
    private int age;

    public Student(){}

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

}
