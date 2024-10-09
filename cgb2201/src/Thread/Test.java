package Thread;
import java.lang.InterruptedException;

public class Test {
    public static void main(String[] args) {
       Thread t1 = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    System.out.print("bar");
                }

            }
        });
                t1.start();
    }
}

