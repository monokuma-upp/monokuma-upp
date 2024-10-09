package Thread.SellTickets;

public class SellTicket extends Thread{
    private int ticket = 10;

    @Override
    public void run(){
        for(int i = 0; i <= 100; i++){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + "卖出票：" + ticket--);
            }
        }
    }

    public static void main(String[] args) {
        SellTicket s1 = new SellTicket();
        SellTicket s2 = new SellTicket();
        SellTicket s3 = new SellTicket();

        s1.start();
        s2.start();
        s3.start();
    }
}
