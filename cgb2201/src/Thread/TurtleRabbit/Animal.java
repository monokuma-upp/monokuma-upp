package Thread.TurtleRabbit;

public abstract class Animal extends Thread{
    public final static int distance = 1000;

    public abstract void running();

    @Override
    public void run(){
        super.run();
        while(distance > 0){
            running();
        }
    }

    public static interface CallToBack{
        public void win();
    }

    public CallToBack callToBack;
}
