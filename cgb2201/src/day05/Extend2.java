package day05;

public class Extend2 {
    public static void main(String[] args) {
        //利用循环计算：求8的阶乘
        int res = 1;
        for(int i = 8; i > 0; i--){
            res *=i;
        }
        System.out.println(res);
    }
}
