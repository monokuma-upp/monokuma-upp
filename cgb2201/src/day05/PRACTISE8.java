package day05;
import java.util.Scanner;
public class PRACTISE8 {
    public static void main(String[] args) {
        /*
        * 我行我素购物管理系统>生日问候
请输入今天的日期（月/日<用两位数表示：）： 05/29
请输入客户生日：08/09
然后判断是否今天生日
是否继续（y/n)
如果是y就重复以上步骤，否则退出程序*/
        Scanner scan = new Scanner(System.in);
        String yn = "";
        while(true){
            System.out.println("请输入今天的日期（月/日<用两位数表示：）：");
            String day = scan.next();
            System.out.println("请输入客户生日:");
            String birth = scan.next();
            if(birth.equals(day)){
                System.out.println("生日快乐");
            }
            else{
                System.out.println("抱歉今天不是你生日");
            }
            System.out.println("是否继续y/n");
            yn = scan.next();
            if(!yn.equals("y")){
               break;
            }
            continue;
        }
    }
}
