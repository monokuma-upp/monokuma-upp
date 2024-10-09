package Thread.TurtleRabbit;

public class Rabbit extends Animal{
    public Rabbit(){
        setName("兔子");
    }

    @Override
    public void running(){
        int dis = distance;
        int step = 5;
        dis -= step;
        System.out.println("兔子跑了" + step + "米，距离终点还有" + dis + "米");

        if(dis <= 0){
            dis = 0;
            System.out.println("兔子获得胜利");
            if(callToBack != null){
                callToBack.win();
            }
        }

        try{
            if((2000 - dis ) % 20 == 0){ //每20米休息一秒
                sleep(1000);
            }
            else{
                sleep(100);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
