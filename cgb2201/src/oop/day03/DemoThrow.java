package oop.day03;


public class DemoThrow {
    public static void main(String[] args) {
        int a =   DemoThrow.div(4,0);
        System.out.println(a);
    }

    public static int div(int a,int b)
    {
        if(b==0)
            throw new ArithmeticException("异常信息：除数不能为0");//抛出具体问题，编译时不检测
        return a/b;
    }
}