package ArrayList;
import java.util.ArrayList;
import java.util.Random;

//案例：
//
//1、随机生成10个[1,100]之间的整数，放到List集合中，遍历显示
//
//2、找出前3名最大值，删除它们，注意可能重复
//
//3、显示删除后的结果

public class deleteMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(new Random().nextInt(100));
        }
        System.out.println(list);

        int count = 0;
        while(count < 3){
            int index = 0;
            for(int i = 0; i < list.size(); i++){
                if(list.get(index) < list.get(i)){
                    index = i;
                }
            }
            list.remove(index);
            count++;
        }
        System.out.println(list);
    }
}
