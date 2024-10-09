package Thread.Synchronize;

public class TicketSell2 implements Runnable {
    private int ticket = 100;

    Object obj = new Object();

    @Override
    public void run(){
        while(true){
            synchronized (obj){
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "卖出座位是：" + ticket-- + "号");
                }
                else{
                    break;
                }
            }
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "卖票结束");
    }

    public static void main(String[] args) {
        TicketSell2 ts = new TicketSell2();

         new Thread(ts, "窗口1").start();
         new Thread(ts, "窗口2").start();
         new Thread(ts, "窗口3").start();
         new Thread(ts, "窗口4").start();

    }
}
