package LinkedList;
import java.util.LinkedList;

public class demo3 {
    public static void main(String[] args) {
        DuiLie dl = new DuiLie();

        dl.add("abc1");
        dl.add("abc2");
        dl.add("abc3");
        dl.add("abc4");

        while(!dl.isNull()){
            System.out.println(dl.getObj());
        }


    }

    public static class DuiLie{
        private LinkedList link;

        public DuiLie(){
            link = new LinkedList();
        }

        public void add(Object obj){
            link.addLast(obj);
        }

        //返回第一个元素
        public Object getObj(){
            return link.removeFirst();
        }
        public boolean isNull(){
            return link.isEmpty();
        }
    }
}
