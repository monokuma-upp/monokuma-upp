package day08;

//定义两个对象Circle和Pointer
//circle用来表示 一个圆对象,有三种属性(x坐标,y坐标,半径radius)
//x, y构造函数初始化为0,radius为1,坐标0,0 半径为1的圆
//pointer用来表示 一个点对象 有两种属性(x坐标, y坐标)
//x,y 构造函数初始化为0, 坐标为 0,0的点
public class Circle {
    //三个数据域,x和y表示圆点的坐标,radius表示半径, point对象表示圆里面的一个点对象,point是circle的子类对象
    private Pointer point;
    private double x;
    private double y;
    private double radius;

    //构造函数,初始化xy坐标为0,radius为1
    public Circle(){
        this(0,0,1);
    }
    //构造函数,初始化point对象, 对象的坐标为给定参数
    public Circle(double x, double y){
        this.point = new Pointer(x,y);
    }
    //构造函数,初始化point对象,对象的坐标为x,y, 半径为给定参数
    public Circle(double x, double y, double radius){
        this.point = new Pointer(x,y);
        this.radius = radius;
    }

    //求定圆的面积
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    //求圆的周长
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    //判断给定的点在不在圆内,调用距离getDistance方法的返回值跟这个圆的radius作比较
    public boolean contains(double x, double y){
        //创建一个点对象
        Pointer c = new Pointer(x,y);
        //计算给定点与圆点的距离
        double distance = point.getDistance(c);
        if(distance > this.radius){
            return false;
        }
        else{
            return true;
        }
    }

    //判断给定的圆在circle这个圆的哪个位置,如果在圆内返回true
    //判断是否在圆内,比较给定圆点与初始圆点circle的距离如果小于
    public boolean contains(Circle circle){
        //计算给定圆的圆点与初始圆对象的圆点的距离
        double distance = point.getDistance(circle.point);
        if(distance >  Math.abs(this.radius - circle.radius)){
            return false;
        }
        else{
            return true;
        }
    }

    //判断给定圆是否与Circle重合
    //
    public boolean overlap(Circle circle){
        double distance = point.getDistance(circle.point);
        if(distance<Math.abs(this.radius-circle.radius)&&distance>(this.radius-circle.radius)){
            return false;
        }else{
            return true;
        }
    }
}


