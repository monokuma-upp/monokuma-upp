package Thread.Practise;

public class CrossPrint {
    private int index = 1;

    public synchronized void print(int i){ //打印数字的方法，每打印两个数字，等待一个字母
        while(index %3 == 0){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("" + i);
            index++;
            notifyAll();
        }
    }

    public synchronized void print(char c){//打印字母，每打印一个字母，等待打印两个数字
        while(index %3 != 0){
            try{
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("" + c);
            index ++;
            notifyAll();
        }
    }

    public static class LetterPrinter extends Thread{//打印字母线程
        private CrossPrint p;
        public LetterPrinter(CrossPrint p){
            this.p = p;
        }
        public void run(){
            for(char c = 'A'; c <= 'Z'; c++){
                p.print(c);
            }
        }
    }

    public static class NumberPrinter extends Thread{//打印数字线程
        private CrossPrint p;
        public NumberPrinter(CrossPrint p){
            this.p = p;
        }

        public void run(){
            for(int a = 1; a <= 52; a++){
                p.print(a);
            }
        }
    }

    public static void main(String[] args) {
        CrossPrint cp = new CrossPrint();
        Thread t1 = new NumberPrinter(cp);
        Thread t2 = new LetterPrinter(cp);

        t1.start();
        t2.start();
    }
}
