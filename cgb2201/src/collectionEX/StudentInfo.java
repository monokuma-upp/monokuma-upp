package collectionEX;

/*
利用ArrayList制作一个学生信息系统 ，可以添加学生，按学号查询学生，删除学生，修改学生信息。
可以用元素再集合中的位置表示班级序号
 */

import java.util.ArrayList;
import java.util.*;
public class StudentInfo {
    ArrayList<String> list = new ArrayList<String>();
    //初始化列表
    Scanner sc = new Scanner(System.in);
    public void init(){
            list.add("xx");
            list.add("yy");
            list.add("zz");
            list.add("pp");
        }

        //增加一个学生
        public void addStu(){
        System.out.println("要添加几个学生");
        int num = sc.nextInt();
        //添加学生
            int i = 0;
            while(i < num){
                System.out.println("请输入学生名字");
                String in = sc.next();
                if(!list.contains(in)){
                    list.add(in);
                }
                i++;
            }

            System.out.println(list);
        }

        //修改一个学生
    public void modify() {
        //获取要修改的学生的序号
        System.out.println("请输入要修改的学生序号：");
        int index = sc.nextInt();
        while(index < 0 || index > list.size()){
            System.out.println("请输入整数的序号");
            index = sc.nextInt();
        }
        System.out.println("请输入修改后的名字：");
        String name = sc.next();
        list.set(index, name);

        System.out.println(list);
    }

    //查找一个学生
    public void seekStudent(){
        System.out.println("请输入你要查找的序号");
        int index = sc.nextInt();
        System.out.println(list.get(index));
    }

    //删除一个学生
    public void deleteStudent(){
        System.out.println("请输入删除学生序号：");
        int index = sc.nextInt();
        list.remove(list.get(index));
        System.out.println(list);
    }

    public static void main(String[] args) {
        StudentInfo stu = new StudentInfo();
        stu.init();
        stu.addStu();
        stu.modify();
        stu.seekStudent();
        stu.deleteStudent();
    }
    }
