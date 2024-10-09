package Thread.WaitNotify;

public class Print {
    private int flag = 1;//信号为1时打印数字，2时打印字母
    private int count = 1;

    public synchronized void printNum(){//打印数字
        if(flag != 1){
            try{
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.print(2 * count - 1);
        System.out.print(2 * count);
        flag = 2;
        notify();
    }

    public synchronized void printChar(){//打印字母
        if(flag != 2){
            try{
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.print((char)(count - 1 + 'A'));
        count ++;
        flag = 1;
        notify();
    }
    public static void main(String[] args) {
        Print print = new Print();
        new Thread(() -> {
            for (int i = 0; i < 26; i++) {
                print.printNum();
            }
        }).start();
        
        new Thread(() -> {
            for (int j = 0; j < 26; j++) {
                print.printChar();
            }
        }).start();
    }
}
