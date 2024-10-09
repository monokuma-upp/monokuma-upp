package Thread.TurtleRabbit;

public class Turtle extends Animal{
    public Turtle(){
        setName("乌龟");
    }

    @Override
    public void running(){
        int step = 2;
        int dis = distance;

        dis -= step;
        System.out.println("乌龟跑了" + step + "米，距离终点还有" + dis + "米");

        if(dis <= 0){
            dis = 0;
            System.out.println("乌龟获得胜利");
            if(callToBack != null){
                callToBack.win();
            }
        }

        try {
            sleep(100);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
