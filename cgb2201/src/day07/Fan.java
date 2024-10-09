package day07;

public class Fan {
    public Fan(){

    }
    final static int SLOW=1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    //私有类数据
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return this.speed;
    }

    public void setOn(boolean on){
        this.on = on;
    }
    public boolean getOn(){
        return this.on;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }

        public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }

    public String toString(boolean on){
        if(this.on){
            return "风扇速度:" + this.speed + " 风扇的颜色:" + this.color + " 风扇的半径:" + this.radius + "\n";
        }
        else{
            return "Fan is off" + " 风扇颜色:" + this.color + " 风扇半径:" + this.radius +"\n";
        }
    }
}
