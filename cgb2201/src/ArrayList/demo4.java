package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class demo4 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("one");
        str.add("two");
        str.add("three");

        Iterator<String> iter = str.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println();

        for(int i = 0; i < str.size(); i++){
            System.out.println(str.get(i));
        }

        for(String s : str){
            System.out.print(s);
        }
    }
}
