package Thread.Synchronize;

import java.util.Date;
import java.text.SimpleDateFormat;
public class Demo1 implements Runnable{
    private static int counter = 1;
    Date startDate = new Date();
    Date date = new Date();//实时获取时间
    SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");

    @Override
    public void run(){

        synchronized (this) { //this指向类Demo1
            for(int i = 0; i < 5; i++){
                try{
                    System.out.println("线程 ：" + Thread.currentThread().getName() + " 当前计数器 ：" + (counter++));
                    System.out.println("开始时间 ：" + startDate + " 当前时间 ：" + dateFormat.format(date));
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Demo1 synThread1 = new Demo1();
        Demo1 synThread2 = new Demo1();
        Thread t1 = new Thread(synThread1, "Thread-1");
        Thread t2 = new Thread(synThread2, "Thread-2");

        t1.start();
        t2.start();

    }
}
