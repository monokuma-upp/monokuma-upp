package LinkedList;
import java.util.*;
/*
1.编写一个Book类，该类至少有name和price两个属性。该类要实现Comparable接口，
在接口的compareTo（）方法中规定两个Book类实例的大小关系为二者的price属性的大小关系。
在主函数中，选择合适的集合类型存放Book类的若干个对象，然后创建一个新的Book类的对象，
并检查该对象与集合中的哪些对象相等。查询结果如下图：
————————————————

 */
public class demo7 {
    public static void main(String[] args) {
        List<Book> list=new ArrayList<Book>();
        list.add(new Book("Java基础教程",30));
        list.add(new Book("数据库技术",29));
        list.add(new Book("C++基础教程",29));

        Iterator<Book> iter=list.iterator();
        System.out.println("输出书名和价格：");
        while(iter.hasNext()){
            Book b=iter.next();
            System.out.println(b.name+"价格："+b.price);
        }


    }

    public static class Book implements Comparable{
         String name;
         int price;

        Book(String name, int price){
            this.name = name;
            this.price = price;
        }

        public int compareTo(Object b){
            Book book = (Book)b;
            return(this.price - book.price);
        }
    }


}
