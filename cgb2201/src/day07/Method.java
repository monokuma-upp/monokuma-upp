package day07;
public class Method {
    public static void main(String[] args) {
        System.out.println("最大值是:" + maxOfNumber(1,2));
        System.out.println("最小值是:" + minOfNumber(345,765));
        System.out.println("是否大写:" + isUpper('t'));;
        System.out.println("是否数字:" + isNum('6'));
        System.out.println("是否英文字母" + isChar('2'));;
        System.out.println("转小写:" + toLower('M'));;
        System.out.println("反向打印");
        printReverse(3573);
        System.out.println("立方:" + cube(34));;
        System.out.println("是否为正:" );
        isPos(-10);
    }
    //封装一个方法，返回两个整数里的较大那个
    public static int maxOfNumber(int num1, int num2){
        if(num1 > num2){
            return num1;
        }
        else if(num1 < num2){
            return num2;
        }
        return num1;
    }

    //封装一个方法，返回两个浮点数里的较小那个
    public static double minOfNumber(int num1, int num2){
        if(num1 < num2){
            return num1;
        }
        else if(num1 > num2){
            return num2;
        }
        return num1;
    }

    //封装一个方法，来判断一个字符是否是大写字母
    public static boolean isUpper(char c){
        return c >= 'A' && c <= 'Z';
    }

    //封装一个方法，来判断一个字符是否是数字字符
    public static boolean isNum(char c){
        return (c + 0) >= 0 && (c + 0) < 9;
    }

    //封装一个方法，来判断一个字符是否是英文字母
    public static boolean isChar(char c){
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    //封装一个方法，传入一个字符，如果是大写那么转化小写然后返回，否则保持不变返回
    public static char toLower(char c){
        if(c >= 'A' && c <= 'Z'){
            c += 32;
        }
        return c;
    }

    //封装一个方法，实现将一个正整数，倒序打印输出! 1234 4321
    public static void printReverse(int num){
        while(num > 0){
            System.out.print(num%10);
            num /=10;
        }
        System.out.println();
    }

    //表达式（立方）	编写程序，计算该数的立方
    public static double cube(double num){
        return num * num * num;
    }

    //表达式(正数判断)传入一个数字, 判断这个数是否是正数(是，打印YES，不是输出NO)
    public static void isPos(int num){
        if(num > 0){
            System.out.println("YES");
        }
        System.out.println("NO");
    }
}
