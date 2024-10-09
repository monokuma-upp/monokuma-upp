package day06;
import java.util.Scanner;
import java.util.Random;
public class TestArray {
    public static void main(String[] args) {
        //定义一个数组来存储12个学生的成绩{72,89,65,58,87,91,53,82,71,93,76,68}，计算并输出学生的平均成绩。
        int score[] = new int[12];
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();
        int sum = 0;
        System.out.println("请输入学生的成绩");
        for(int i = 0; i < score.length; i++){
            score[i] = rd.nextInt(100);
            System.out.println(score[i]);
            sum+=score[i];
        }
        System.out.println("平均值:" + sum/score.length);
    }
}
