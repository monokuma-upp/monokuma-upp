package Thread.Practise;
//1.设计一个多线程的程序如下：设计一个火车售票模拟程序。假如火车站要有100张火车票要卖出，
// 现在有5个售票点同时售票，用5个线程模拟这5个售票点的售票情况。
public class TicketSale implements Runnable{
    public int total = 100;//总票数
    public int num = 0;//票号

    @Override
    public void run(){

            while (total > 0) {
                synchronized (this) {
                    if (total > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() +
                                "卖出了" + (++num) + "号票，还剩 " + (--total) + "张票");
                    }
                }
        }
    }
    public static void main(String[] args) {
        TicketSale ts = new TicketSale();
       for(int i = 1; i <= 5; i++){
           new Thread(ts,"售票点" + i).start();
       }
    }
}
