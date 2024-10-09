package Weekend;

public class Car {
    private String brand;
    private String color;
    private int wheel;
    private int seat;

    public Car(){ } //无参构造方法

    public Car(String brand, String color){//双参
        this.brand = brand;
        this.color = color;
    }

    public Car(String brand, String color, int wheel, int seat){
        this.brand = brand;
        this.color = color;
        this.wheel = wheel;
        this.seat = seat;
    }

    //访问器和修改器
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void setWheel(int wheel){
        this.wheel = wheel;
    }
    public int getWheel(){
        return wheel;
    }

    public void setSeat(int seat){
        this.seat = seat;
    }
    public int getSeat(){
        return seat;
    }

    public void print(){
        System.out.println("这是一辆" + this.getColor() +"颜色的，" +this.getBrand() + "牌的非机动车，有" + this.getWheel() +"个轮子，有" + this.getSeat() + "个座椅的非机动车");
    }
}
