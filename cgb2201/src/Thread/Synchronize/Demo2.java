package Thread.Synchronize;
//多个线程访问synchronized和非synchronized代码块
public class Demo2 implements Runnable {
    private int count;

    public Demo2(){
        count = 0;
    }

    public void addCount(){ //同步代码块，每次都
        synchronized (this){//同步代码块指向代码块里面的对象
            for(int i = 0; i < 5; i++){
                try{
                    System.out.println(Thread.currentThread().getName() + " :" + (count++));
                    Thread.sleep(100);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public void printCount(){ //非同步代码块
        for(int i = 0; i < 5; i++){
            try{
                System.out.println(Thread.currentThread().getName() + " count :" + count);
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run(){
        if(Thread.currentThread().getName().equals("A")){
            addCount();
        }
        if(Thread.currentThread().getName().equals("B")){
            printCount();
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Demo2(), "A"); //同步调用线程
        Thread t2 = new Thread(new Demo2(), "B"); //非同步调用线程
        t1.start();
        t2.start();
    }
}
