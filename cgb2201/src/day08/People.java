package day08;

public class People {
    private double height;
    private double weight;

    public People(double height, double weight){
        super();
        this.height = height;
        this.weight = weight;
    }
    public double getHeight(){
        return this.height;
    }
    public double getWeight(){
        return this.weight;
    }
    public void speakHello(){
        System.out.println("你好");
    }
    public void averageWeight(){
        System.out.println("平均体重: " + weight);
    }
    public void averageHeight(){
        System.out.println("平均身高: " + height);
    }
}
