package day07;
import java.util.Scanner;
public class StudentTest {
    public static void main(String[] args) {
        /*
        具有属性：姓名，年龄，其中年龄不能小于16岁，否则输出错误信息
        具有方法：自我介绍，负责输出该学生的姓名，年龄。
        编写测试类StudentTest 进行测试，看是否符合要求
         */
        Student student = new Student();
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入名字:");
        String name = scan.next();
        System.out.println("请输入年龄:");
        int age = scan.nextInt();
        student.setAge(age);
        student.setName(name);
        student.print();
    }
    }

