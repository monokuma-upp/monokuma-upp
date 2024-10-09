package Queue.Demo1;

public class MyQueueTest {
    public int number;
    public String name;

    public MyQueueTest(int number, String name){
        this.number = number;
        this.name = name;
    }

    public static void main(String[] args) {
        MyQueueTest t1 = new MyQueueTest(1,"dada");
        MyQueueTest t2 = new MyQueueTest(2,"gdgd");
        MyQueueTest t3 = new MyQueueTest(3,"qwer");
        MyQueueTest t4 = new MyQueueTest(4,"juku");

        MyQueue q = new MyQueue();
        q.Add(t1);
        q.Add(t2);
        q.Add(t3);
        q.Add(t4);

        MyQueueTest test1 = (MyQueueTest)q.Search(0);
        System.out.println(test1.number + " " + test1.name);
        q.Change(4,"这是被修改的元素名字");

        q.Minus(2);

        MyQueueTest test2 = (MyQueueTest)q.Search(2);
        System.out.println(test2.number + test2.name);
    }
}
