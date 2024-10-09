package Thread;

public class ThreadMe implements Runnable{

    String name=null;
    ThreadMe(String name)
    {
        this.name=name;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        int i = 0;
        outer:
        while(true)
        {
            try{
                Thread.sleep(2000);//先休眠2000ms,再将线程运行
            }
            catch(InterruptedException e){
                e.printStackTrace();
        }
            System.out.println(this.name + "这是输出结果" + i);
            i++;
            if(i > 6){
                break outer;
            }
        }
    }

    public static void main(String[] args) {
        ThreadMe mya=new ThreadMe("线程A");
        Thread testA=new Thread(mya);
        testA.start();

        ThreadMe myb=new ThreadMe("线程B");
        Thread testB=new Thread(myb);
        testB.start();
    }
}
