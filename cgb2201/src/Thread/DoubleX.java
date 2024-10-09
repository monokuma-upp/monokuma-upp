package Thread;
import java.lang.InterruptedException;
public class DoubleX{
    public static double x = 0;
    public static double y = 0;
    public DoubleX(){}

    public static class AThread implements Runnable{
        public void run(){
            try{
                outer:
                while(true){

                    Thread.sleep(300);
                    x += 1;
                    System.out.println("线程A：" + x);
                    if(x > 23){
                        break outer;
                    }
                }
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static class BThread implements Runnable{
        public void run(){
            try{
                outer:
                while(true){
                    Thread.sleep(400);
                    y += .1;
                    System.out.println("线程B：" + y);
                    if(y > 23){
                        break outer;
                    }
                }
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }



    public static void main(String[] args) {
        AThread a = new AThread();
        Thread t1 = new Thread(a);
        BThread b = new BThread();
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();

    }
}
