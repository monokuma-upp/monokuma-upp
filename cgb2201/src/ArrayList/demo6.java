package ArrayList;

import java.util.ArrayList;

//.删除第一个字符串中出现的第二个字符串中的字符
public class demo6 {
    public static void func(String s1, String s2){
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            if(!s2.contains(ch + "")){
                list.add(ch + "");
            }
        }
        for(String ch : list){
            System.out.println(ch);
        }
    }

    public static void main(String[] args) {
        String s1 = "welcome to me";
        String s2 = "wel";
        func(s1,s2);
    }
}
