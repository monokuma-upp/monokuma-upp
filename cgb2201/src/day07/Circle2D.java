package day07;

import java.awt.*;
//定义两个对象,一个circle2d表示圆,圆有x,y坐标和半径属性
//一个pointer表示点,点有点坐标x,y属性
/*
public class Circle2D {
    private Pointer point;
    private double x;
    private double y;
    private double radius;

    //无参构造方法
    public Circle2D(){
      this(0,0,1);
    }
    //y=有参构造 表示一个带有坐标的圆
    public Circle2D(double x, double y){
        //初始化这个点到圆心(0,0)
        this.point = new Pointer(x,y);
    }
    //表示一个有坐标,有半径的构造函数
    public Circle2D(double x, double y, double radius){
        point = new Pointer(x,y);
        this.radius = radius;
    }

    //get
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double radius(){
        return this.radius;
    }

    //返回圆面积
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    //返回圆周长
    public double getPerimiter(){
        return 2 * Math.PI * this.radius;
    }
    public boolean contains(double x, double y){
        //分三种情况,点在圆内,点在圆上,点在圆外
        //用距离getDISTANCE函数来判断点对象在哪个位置
        //定义一个pointer对象表示坐标用来计算坐标到原点距离来判断点的位置
        //新建一个点
        Pointer c = new Pointer(x, y);
        double distance = point.getDistance(c);
        if(distance > this.radius){
            return false;
        }
        else{
            return true;
        }
    }
//判断另一个圆在这个圆的哪个位置
    //1.在里面
    //2.在外面
    //3.重合
    public boolean contains(Circle2D other){
        double distance = point.getDistance(other.point);
        if(distance > Math.abs(this.radius - other.radius)){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean overlap(Circle2D other){
        double distance = point.getDistance(other.point);
        if(distance < Math.abs(this.radius - other.radius) && distance > Math.abs(this.radius - other.radius)){
            return false;
        }
        else{
            return true;
        }
    }
}

//坐标点对象
class Pointer{
    private double x,y;
    public Pointer(){
        this(0,0);
    }
    public Pointer(double x, double y){
        this.x = x;
        this.y = y;
    }
    //计算坐标点和原点的距离
    public double getDistance(Pointer c){
        double deltX = this.x - c.x;
        double deltY = this.y - c.y;
        return Math.sqrt(Math.pow(deltX,2) + Math.pow(deltY, 2));
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
}
*/