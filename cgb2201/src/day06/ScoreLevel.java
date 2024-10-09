package day06;

public class ScoreLevel {
    public static void main(String[] args) {
        /*
        定义一个数组来存储12个学生的成绩{72,89,65,58,87,91,53,82,71,93,76,68}，统计各成绩等级
        （90分以上为‘A’，80~89分为‘B’，70~79分为‘C’，60~69分为‘D’，60分以下为E）学生人数，并将其放入
        到数组count中，其中：count[0]存E级的人数，count[1]存D级的人数，……，count[4]存A级的人数。
         */
        int score[] = {72,89,65,58,87,91,53,82,71,93,76,68};
        int count[] = new int[5];
        for(int i = 0; i < score.length; i ++){
            if(score[i] > 90){
                count[4] ++;
            }
            else if(score[i] > 80){
                count[3] ++;
            }
            else if(score[i] > 70){
                count[2] ++;
            }
            else if(score[i] > 60){
                count[1] ++;
            }
            else{
                count[0] ++;
            }
        }
        for(int j = 0; j <count.length; j++){
            System.out.println(count[j]);
        }
    }
    }

