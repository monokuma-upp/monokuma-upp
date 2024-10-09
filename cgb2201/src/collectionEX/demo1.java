package collectionEX;
import java.util.ArrayList;
import java.util.Random;
/*
生成6个1~44之间的随机整数，添加到集合，并遍历集合。
思路:
1．需要存储6个数字，创建一个集合，
2．产生随机数，需要用到Random
3.用循环6次,来产生6个随机数字:for循环
4．循环内调用r.nextInt(int n)，参数是33，0~32,整体+1才是1到33.
5．把数字添加到集合中:add
6．遍历集合:for、size、 get
 */
public class demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random rd = new Random();
        for(int i = 0; i < 6; i++){
            int num = (rd.nextInt(44));
            arr.add(num);
        }

        //遍历列表
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }

        String[] str = new String[]{"dada","daa","daada"};

    }
}
