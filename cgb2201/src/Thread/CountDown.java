package Thread;
/*
创建一个倒数计数线程。要求：1.该线程使用实现Runnable接口的写法；2.程序该线程每隔0.5秒打印输出一次倒数数值（数值为上一次数值减1）。

输入格式:
N（键盘输入一个整数）

输出格式:
每隔0.5秒打印输出一次剩余数

输入样例:
6
输出样例:
在这里给出相应的输出。例如：

6
5
4
3
2
1
0

 */

import java.util.Scanner;

public class CountDown implements Runnable {
    public int num;

    public CountDown(){
        System.out.println("请输入一个整数：");
        this.num = new Scanner(System.in).nextInt();
    }
    public void run(){
        try{
            while(num >= 0) {
                Thread.sleep(500);
                System.out.println(num);
                num--;
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CountDown c = new CountDown();
        Thread t = new Thread(c);
        t.start();
    }
}
