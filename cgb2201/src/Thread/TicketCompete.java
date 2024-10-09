package Thread;

//3个黄牛抢99张票，竞争同一资源
public class TicketCompete implements Runnable{
    private int ticketNum = 10;
    public void run(){
        while(true){
            if(ticketNum < 0){
                break;
            }
            //模拟网络延时
            try{
              Thread.sleep(2000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->" + ticketNum--);
        }
    }

    public static void main(String[] args) {
        TicketCompete tc = new TicketCompete();
        Thread t1 = new Thread(tc,"HuangNiu1");
        Thread t2 = new Thread(tc,"HuangNiu2");
        Thread t3 = new Thread(tc,"HuangNiu3");

        t1.start();
        t2.start();
        t3.start();
    }
}
