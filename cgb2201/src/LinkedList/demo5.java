package LinkedList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//已知数组存放一批 QQ 号码,长度 5-11 位， String[] strs =
// {“10001”,“10086”,“12347806666”,“45612378901”,“10001”,“12347806666”}。
// 将该数组里面的所有 qq 号都存放在 LinkedList 中，将 list 中重复元素删除，将 list
// 中所有元素分别用迭代器和增强 for 循环打印出来。

public class demo5 {
    public static void main(String[] args) {
        String[] str = new String[]{"10001", "10086", "1234787045", "5465455654", "10001", "14234586"};
        for(Object i : deleteRepeat(str)){
            System.out.println(i);
        }

        Iterator<String> e = deleteRepeat(str).iterator();
        while(e.hasNext()){
            String s = e.next();
            System.out.println(s);
        }
    }

    public static LinkedList deleteRepeat(String[] str){
        LinkedList<String> list = new LinkedList<>();
        //如果链表里没有这个字符串，则把这个字符串加进去，如果有就直接加进去

        for(int i = 0; i < str.length; i++){
            if(list.contains(str[i])){
                continue;
            }
            list.add(str[i]);
        }
        return list;
        //删除
    }
}
