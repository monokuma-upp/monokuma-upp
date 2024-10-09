package Queue.Demo3;

public class QueueTest {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(433);
        q.add(323);
        q.add(431);

        q.show();
        System.out.println("");
        System.out.println("---------------");
        System.out.println("被删除的头部元素：" + q.delete());
        q.show();

        System.out.println("");
        System.out.println("---------------");
        q.change(2,34);
        q.show();

        System.out.println("");
        System.out.println("---------------");
        System.out.println(q.search(323));

    }
}
