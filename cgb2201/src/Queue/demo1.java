package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class demo1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();
        queue.add("元素A");
        queue.offer("元素B");
        queue.offer("元素C");
        queue.offer("元素D");
        queue.offer("元素E");

        while(queue.size() > 0){
            String element = queue.poll();
            System.out.println(element);
        }
    }
}
