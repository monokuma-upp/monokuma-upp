package ArrayList;
//1、用一个String[]数组存点数
//
//2、用一个String[]数组存花色
//
//3、用一个String[]数组存大王、小王
//
//4、用上面的数组，生成一副扑克牌
//
//5、遍历显示全副扑克牌
//
//6、模拟给4个人随机发牌，每个人11张牌
//
//7、显示每个人的牌和剩余的

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class pokerGame {
    public static void main(String[] args) {
        //先用一个数组存储点数 3,4,5,6,7,8,9,10，j,q,k,A,2
        String[] point =  {"A","2","3","4","5","6","7","8","9"
                ,"10","J","Q","K"};
        //用一个数组储存花色
        String[] shape = {"黑桃","红桃","方片","梅花"};
        //储存大王小王
        String[] ghost = {"大王", "小王"};

        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                list.add(shape[i] + point[j]);
            }
            System.out.println();
        }
        list.add(ghost[0]);
        list.add(ghost[1]);

        for(int k = 0; k < list.size(); k++){
            if(k % 13 == 0 && k > 0){
                System.out.print(list.get(k) + " ");
                System.out.println();
            }
            System.out.print(list.get(k) + " ");
        }

        System.out.println();
        System.out.println("----------------");
        //模拟给4个人随机发牌，每个人11张牌
        System.out.println("第1个人的牌" + setCard(list));
        System.out.println("第2个人的牌" + setCard(list));
        System.out.println("第3个人的牌" + setCard(list));
        System.out.println("第4个人的牌" + setCard(list));
        System.out.println("剩余的牌" + list);
    }

    public static ArrayList<String> setCard(ArrayList<String> list){
        ArrayList<String> p1 = new ArrayList<>();
        for(int i = 0; i < 11; i++){
            int rd = new Random().nextInt(list.size());
            p1.add(list.get(rd));
            list.remove(rd);
        }
        return p1;
    }

}
