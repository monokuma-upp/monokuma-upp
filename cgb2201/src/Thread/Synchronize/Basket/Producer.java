package Thread.Synchronize.Basket;

public class Producer extends Thread{
    private Basket basket;

    public Producer(Basket basket){
        super();
        this.basket = basket;
    }

    @Override
    public void run(){
        while (true){
            synchronized (basket){
                try{
                    if(!basket.isEmpty()){
                        basket.wait();//线程等待的状态
                    }
                    System.out.println("生成水果");
                    basket.setEmpty(false);
                    basket.notify();//通知在这个共享对象上等待的线程
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
