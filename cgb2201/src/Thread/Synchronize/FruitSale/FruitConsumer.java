package Thread.Synchronize.FruitSale;

public class FruitConsumer implements Runnable {
    private Fruit fruit;

    public FruitConsumer(Fruit fruit){
        this.fruit = fruit;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (fruit) {
                try {
                    if (fruit.isEmpty()) {
                        fruit.wait();
                    }
                    System.out.println("水果空了,请生产");
                    System.out.println(Thread.currentThread().getName() + "消费了" + (Fruit.amount--) + "个水果");
                    Thread.sleep(100);
                    fruit.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
