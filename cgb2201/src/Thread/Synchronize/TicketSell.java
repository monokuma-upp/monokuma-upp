package Thread.Synchronize;

public class TicketSell extends Thread{
    private String name;

    static int ticket = 100;

    static Object obj = new Object();

    public TicketSell(String name){
        this.name = name;
    }

    @Override
    public void run(){
        while(true){
            synchronized (obj){ //同步卖票过程
                if(ticket > 0){
                    System.out.println(name + "卖出座位是:" + (ticket--) + "号");
                }
                else{
                    break;
                }
            }

            try{
                Thread.sleep(200);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(name + "卖票结束");
    }


    public static void main(String[] args) {
        TicketSell t1 = new TicketSell("窗口1");
        TicketSell t2 = new TicketSell("窗口2");
        TicketSell t3 = new TicketSell("窗口3");
        TicketSell t4 = new TicketSell("窗口4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
