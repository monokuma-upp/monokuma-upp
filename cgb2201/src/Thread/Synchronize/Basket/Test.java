package Thread.Synchronize.Basket;

public class Test {
    public static void main(String[] args) {
        Basket basket = new Basket();
        Producer producer = new Producer(basket);
        Consumer consumer = new Consumer(basket);

        //定义两个线程分别处理消费者和生产者的水果处理
        Thread t = new Thread(producer);
        Thread t1 = new Thread(consumer);

        t.start();
        t1.start();
    }
}
