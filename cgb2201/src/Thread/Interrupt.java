package Thread;

public class Interrupt extends Thread{
    @Override
    public void run(){
        super.run();
        for(int i = 0; i < 10; i++){
            System.out.println("i=" + (i+1));
        }
    }

    public static void main(String[] args) {
        try{
            Interrupt inter = new Interrupt();
            Thread t = new Thread(inter);
            t.start();
            Thread.sleep(200);
            inter.interrupt();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
