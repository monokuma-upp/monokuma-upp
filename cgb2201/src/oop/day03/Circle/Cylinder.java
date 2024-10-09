package oop.day03.Circle;

public class Cylinder implements C{
    private double radius;
    private double height;
    private String color;

    public Cylinder(double radius, double height, String color){
        this.radius = radius;
        this.height = height;
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public double area(){
        return PI * Math.pow(radius, 2);
    }

    public void volume(){
        System.out.println("圆柱体积为:" + this.area() * this.height);
    }
}
