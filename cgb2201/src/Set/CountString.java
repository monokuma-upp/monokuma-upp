package Set;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;
//案例：键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，
// 必须保证顺序。例如输入：aaaabbbcccddd，打印结果为：abcd。
public class CountString {
    public static void main(String[] args) {
        String str = "Your。future：depends #@￥on your dreams, so go to sleep.";
        HashMap<Character, Integer> map = new HashMap<>();
        str = str.replaceAll("[^a-zA-Z]", "");

        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){ //如果map里面有这个字符，表示重复出现了
                Integer count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        Set<Entry<Character, Integer>> entrySet = map.entrySet();
        for(Object o: entrySet){
            System.out.println(o);
        }
    }
}
