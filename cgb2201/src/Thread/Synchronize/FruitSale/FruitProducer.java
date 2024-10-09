package Thread.Synchronize.FruitSale;

//新建一个
public class FruitProducer implements Runnable {
    private Fruit fruit;


    public FruitProducer(Fruit fruit){
        this.fruit = fruit;
    }

    @Override
    public void run(){
        while(true){
            synchronized (fruit){
            try{
                if(!fruit.isEmpty()){
                    fruit.wait();
                }
                System.out.println("可以带走水果了");
                System.out.println(Thread.currentThread().getName() + "生产了" + (Fruit.amount++) + "个水果");
                fruit.setEmpty(false);
                Thread.sleep(500);
                fruit.notify();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        }
    }
}
