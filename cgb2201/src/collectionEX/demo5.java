package collectionEX;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
/*
使用ArrayList集合，对其添加100个不同的元素：
1.使用add()方法将元素添加到ArrayList集合对象中；
2.调用集合的iterator()方法获得Iterator对象，并调用Iterator的hasNext()和next()方法，迭代的读取集合中的每个元素；
3.调用get()方法先后读取索引位置为50和102的元素，要求使用try-catch结构处理下标越界异常；
 */

public class demo5 {
    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i = 0; i < 100; i++){
            num.add(rd.nextInt(100));
        }

        Iterator<Integer> e = num.iterator();
        System.out.print("[ ");
        while(e.hasNext()){
            System.out.print(e.next() + " ");
        }
        System.out.print(" ]");

        try{
            System.out.println("下标50的元素是：");
            System.out.println(num.get(50).toString());
            System.out.println("下标");
            System.out.println(num.get(102).toString());
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("下标越界！");
            ex.printStackTrace();
        }
    }
}
