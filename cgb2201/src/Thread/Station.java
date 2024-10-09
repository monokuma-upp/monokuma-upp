package Thread;

import java.io.IOException;

public class Station extends Thread {
    private static int tickets = 50;
    private static Object obj = "aa";

    public Station(String name){
        super(name);
    }

    @Override
    public void run(){
        while(true){
            if(tickets > 0){
                synchronized(obj){
                    if(tickets == 0){
                    System.out.println("票票卖完了");
                    break;
                    }
                    System.out.println(Thread.currentThread().getName() + "卖出了第" + tickets + "张票");
                    tickets --;
                    }
                }

                try{
                    sleep(1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }

        }
    }

    public static void main(String[] args) {
        Station s1 = new Station("窗口1");
        Station s2 = new Station("窗口2");
        Station s3 = new Station("窗口3");

        s1.start();
        s2.start();
        s3.start();
    }
}
