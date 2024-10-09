package Thread;
import java.lang.InterruptedException;
public class RunnableDemo {
    static class MyRunnable implements Runnable{
        private static int ticket = 100;

        @Override
        public void run(){
            try{
                while (ticket > 0) {
                    Thread.sleep(100);
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "卖掉了一张票，还剩" + ticket + "张票");
                }
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }

            }
        }

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();

    }
    }

