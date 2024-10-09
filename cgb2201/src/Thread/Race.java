package Thread;

public class Race implements Runnable{
    private static String winner;
    public void run() {
        for(int steps =1;steps<=100;steps++)
        {
            System.out.println(Thread.currentThread().getName()+"-->"+steps);
            //判断是否结束
            boolean flag = gameOver(steps);
            if(flag) {
                break;
            }
        }
    }


    private boolean gameOver(int steps) {
        if(winner!=null) {
            return true;
        }else {
            if(steps == 100)
            {
                winner = Thread.currentThread().getName();
                System.out.println("winner-->"+winner);
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        new Thread(new Race(),"兔子").start();
        new Thread(new Race(),"龟").start();
    }

}
