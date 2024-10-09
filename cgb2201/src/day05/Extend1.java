package day05;

public class Extend1 {
    public static void main(String[] args) {
        //利用循环计算：求数字1到100之内，所有偶数的和
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i%2 == 0){
                sum+=i;
            }
        }
        System.out.println("1到100所有偶数的和是：" + sum);
    }
}
