package day05;
import java.util.Scanner;
public class LOGIN {
    public static void main(String[] args) {
        /*
        实现“考试系统“登录功能

1）  根据提示输入用户名与密码，成功后显示登陆成功的信息。

2）  失败给出提示信息。

3）  只允许三次输入用户名与密码的机会。
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("欢迎登陆考试系统");
        String user = "byin";
        String password = "123";
        for(int i = 2; i >= 0 ; i--){
            System.out.println("请输入用户名");
            String login = scan.next();
            System.out.println("请输入密码");
            String psw = scan.next();
            if(login.equals(user)&&psw.equals(password)){
                System.out.println("登陆成功");
                break;
            }
            else if(i > 0){
                System.out.println("用户名或密码输入错误，您还有" + i + "次机会");
            }
            else{
                System.out.println("您今天不可以登陆了");
            }
        }

    }
}
