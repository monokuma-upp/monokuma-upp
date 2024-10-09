package Thread.Synchronize;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread mt = new MyThread("肖申克的救赎");
        MyThread mh = new MyThread("美丽人生");

        Thread t1 = new Thread(mt, mt.name);
        Thread t2 = new Thread(mh,mh.name);

        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t1.start();
    }

    static class MyThread implements Runnable{
        private String name;

        public MyThread(String name){
            this.name = name;
        }
        @Override
        public void run(){
            while (true){
            try{
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() );
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        }
    }
}
