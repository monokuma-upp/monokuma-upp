package Thread.Synchronize.FruitSale;

import Thread.Synchronize.Basket.Producer;

public class FruitTest {
    public static void main(String[] args) {
        Fruit fruit = new Fruit(true);
        Thread t1 = new Thread(new FruitProducer(fruit));
        Thread t2 = new Thread(new FruitConsumer(fruit));

        t1.start();
        t2.start();
    }
}
