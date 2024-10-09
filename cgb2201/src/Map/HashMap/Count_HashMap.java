package Map.HashMap;
import java.util.HashMap;
import java.util.Scanner;

// 统计字符串中每个字符出现的次数
//
//
//
//
// 分析:
//  1.定义一个需要被统计字符的字符串
//  2.将字符串转换成字符数组
//  3.定义双列集合,用来存储字符串中字符以及字符出现的次数
//  4.遍历字符数组获取每一个字符,并将字符存储在双列集合中
//     存储过程中要做判断,如果集合中不包含这个键,就将该字符当做键,值为1存储,如果集合中包含这个键,就将值加1存储
//  5.打印双列集合获取字符出现的次数

public class Count_HashMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input a string:");
        String str = input.nextLine();
        char[] arr = str.toCharArray();//把字符串转化为字符数组

        HashMap<Character, Integer> hm = new HashMap<>();//定义哈希图，键值对存char字符和整型
        for(char ch : arr){//遍历字符数组
            hm.put(ch, !hm.containsKey(ch)?1: hm.get(ch) + 1);
            //第一个键值存单个字符，第二个键值判断图里面是否不包含这个字符，如果不包含就说明只出现了一次，次数为1
            //如果包含就说明重复了，在原字符的基础上键值加1
        }

        System.out.println("\nstatistics");

        for(char key: hm.keySet()){
            System.out.println("字符" + key + "出现了" + hm.get(key) + "次");
        }

    }
}
