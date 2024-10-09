package Thread.SellTickets;

public class SellTicket1  implements Runnable{
    private int ticket = 10;

    public void run(){
        for (int i = 0; i <= 100; i++) {
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+"--卖出票：" + ticket--);
            }
        }
    }

    public static void main(String[] args) {
        SellTicket1 s = new SellTicket1();
        Thread t1 = new Thread(s,"窗口1");
        Thread t2 = new Thread(s,"窗口2");
        Thread t3 = new Thread(s,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
