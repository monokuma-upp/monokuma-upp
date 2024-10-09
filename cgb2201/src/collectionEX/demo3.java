package collectionEX;
import java.util.ArrayList;
import java.util.Random;
/*
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
要求使用自定义的方法来实现筛选。

分析:
1.需要创建一个大集合,用来存储int数字:
2．随机数字就用Random nextInt
3．循环20次，把随机数字放入大集合: for循环、add方法
4．定义一个方法，用来进行筛选。
筛选:根据大集合,筛选符合要求的元素，得到小集合。
三要素
返回值类型:ArrayList小集合（里面元素个数不确定)
方法名称: getSmalLList
参数列表:ArrayList大集合（装着20个随机数字)
5．判断（if)是偶数: num % 2== e
6.如果是偶数，就放到小集合当中,否则不放。
 */
public class demo3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(rd.nextInt(100));
            System.out.print(list.get(i) + " ");
        }
        System.out.print(findEven(list));
    }


    static ArrayList<Integer> findEven(ArrayList<Integer> li) {
        ArrayList<Integer> small = new ArrayList<Integer>();
        for (int i = 0; i < li.size(); i++) {
            if (li.get(i) % 2 == 0) {
                small.add(li.get(i));
            }
        }
        return small;
    }
}