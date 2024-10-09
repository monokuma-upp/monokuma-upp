package day05;

public class PRACTISE3 {
    public static void main(String[] args) {
        //循环输出以下结果：
        //25=10
        //410=40
        //6*15=90
        //……
        //?*100=?
        /*
        while循环 i=5 j=2初始变量 每次执行while i+5 j+2循环直到 i到100程序结束
         */
        int i = 5;
        int result = 0;
        int j = 2;
        while(i <= 100){
            result = i*j;
            System.out.println(i+" * "+ j +" = "+ result);
            i += 5;
            j += 2;
        }
    }
}
