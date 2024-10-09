package Map.HashMap.StudentManage;


import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class View {
    private Scanner input;
    private StudentController sc;

    private static final View view = new View();

    private View(){
        input = new Scanner(System.in);
        sc = new StudentController();
    }

    public static View getInstance(){
        return view;
    }

    //系统初始化,让系统运行前就有一部分数据,方便测试用
    public void init(){
        sc.add(new StudentInfo(1234567,"jim","male",18, "13048754515"));
        sc.add(new StudentInfo(1234567,"eric","male",18, "1646555626"));
        sc.add(new StudentInfo(1234567,"mill","female",18,"1452455456"));
        sc.add(new StudentInfo(1234567,"ari","male",18, "1664646555"));

        System.out.printf("学生信息列表：");
        showAll();
        System.out.printf("以上为初始化学生信息列表,方便测试用.\\n\\n");

    }


    //下面是初始化代码


    public void run(){
        boolean flag = true;
        exit:
           while(flag){
               menu();
                int i = input.nextInt();
                input.nextLine();

                switch(i){
                    case 1:
                        addSc();
                        break;
                    case 2:
                        deleteSc();
                        break;
                    case 3:
                        reviseSc();
                        break;
                    case 4:
                        querySc();
                        break;
                    case 5:
                        showAll();
                        break;
                    case 6:
                        break exit;
                    default:
                        break;
                }
               }
           input.close();
        System.out.println("系统退出");
           }


    public void menu() {
        System.out.println("=========学生管理系统=========");
        System.out.println(" 1. 添加学生");
        System.out.println(" 2. 删除学生");
        System.out.println(" 3. 修改学生信息");
        System.out.println(" 4. 查看学生信息");
        System.out.println(" 5. 显示所有信息");
        System.out.println(" 6. 退出系统");
        System.out.println("==========================");
        System.out.print(" 请选择1~6: ");
    }

    //新建一个完整的学生对象
    //使用正则表达式判断字符串输入的合理性
    public void newSc(StudentInfo studentInfo, int flag){
        String string = "";
        boolean isOk = false;

        do {
            if (flag == 0 || flag == 1) {
                System.out.printf("\t学号：");
                string = input.nextLine();
                if (string.matches("[\\\\d]{9}")) {
                    studentInfo.setId(Integer.valueOf(string));
                    isOk = true;
                } else {
                    System.out.println("error:学号必须为9位数字\n重新输入");
                }
            }

            if (flag == 0 || flag == 2) {
                System.out.println("姓名：");
                string = input.nextLine();
                studentInfo.setName(string);
                isOk = true;
            }

            if (flag == 0 || flag == 3) {
                System.out.println("性别：");
                string = input.nextLine();
                studentInfo.setSex(string);
                isOk = true;
            }

            if (flag == 0 || flag == 4) {
                System.out.println("年龄：");

                String ageStr = input.nextLine();

                if (ageStr.matches("[\\\\d]{1,2}\"")) {//年龄必须为1-2位数字
                    studentInfo.setAge(Integer.parseInt(ageStr));
                    isOk = true;
                } else {
                    System.out.println("error:年龄必须为1-2位数字请重新输入");
                }
            }

            if (flag == 0 || flag == 5) {
                System.out.println("电话：");
                string = input.nextLine();
                if (string.matches("[\\\\d]{7,11}")) {
                    studentInfo.setPhone(string);
                    isOk = true;
                } else {
                    System.out.println("error:请输入正确格式的手机号码");
                }
            }
        }while(!isOk);
    }

    public void addSc(){
        System.out.printf("请输入要添加学生的信息：");

        StudentInfo studentInfo = new StudentInfo(1320541122,"","",0,"");
        newSc(studentInfo, 0);

        if(sc.add(studentInfo)){
            System.out.println("添加成功");
            System.out.println(studentInfo);
        }
        else{
            System.out.println("添加失败");
        }
    }

    public void deleteSc(){
        System.out.println("请输入要删除的学号");
        String id = input.nextLine();

        StudentInfo studentInfo = sc.delete(Integer.valueOf(id));

        if(studentInfo == null){
            System.out.println("不存在该联系人");
        }
        else{
            System.out.println(studentInfo);
            System.out.println("学生删除成功");
        }
        showAll();
    }

    public void reviseSc(){
        System.out.println("请输入要改的学号：");
        String str = input.nextLine();
        int id = Integer.parseInt(str);

        StudentInfo studentInfo = sc.query(id);
        if(studentInfo == null){
            System.out.println("不存在该学生");
            return;
        }
        System.out.println(studentInfo);
        boolean flag = true;
        while(flag){
            System.out.println("=========修改学生信息=========");
            System.out.println(" 1. 修改学号");
            System.out.println(" 2. 修改姓名");
            System.out.println(" 3. 修改性别(这个你...确定要改? ^_*)");
            System.out.println(" 4. 修改年龄");
            System.out.println(" 5. 修改联系方式");
            System.out.println(" 6. 结束修改");
            System.out.println("==========================");
            System.out.print(" 请选择1~6: ");

            int i = Integer.parseInt(input.nextLine());
            if(i == 6){
                break;
            }
            newSc(studentInfo, i);
        }

        sc.update(id, studentInfo);
        System.out.println("修改成功");
        System.out.println(studentInfo);
    }

//查找学生信息
    public void querySc(){
        System.out.println("请输入要查看的学生学号");
        String str = input.nextLine();

        StudentInfo s = sc.query(Integer.parseInt(str));
        if(s == null){
            System.out.println("不存在该学生");
        }
        else{
            System.out.println(s);
        }
    }

    public void showAll(){
        List<StudentInfo> list = sc.getAllModify();
        Collections.sort(list);
        System.out.println("---------------");
        System.out.println("总共" + list.size() + "条信息");
        for(StudentInfo info: list){
            System.out.println(info);
        }
        System.out.println();
    }

    }

