package Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class lab1 {
    public static void main(String[] args) {
        Set<String> str = new HashSet<String>();
        str.add("first");
        str.add("second");
        str.add(null);
        str.add("dadada");
        str.remove("first");

        Iterator<String> e = str.iterator();
        while(e.hasNext()){
            System.out.println(e.next());
        }

        for(String s: str){
            System.out.println(s);
        }
    }
}
