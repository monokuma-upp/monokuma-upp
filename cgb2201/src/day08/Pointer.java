package day08;

class Pointer{
    //初始化两个个数据域x,y
    private double x;
    private double y;

    //构造函数,有参和无参的都写上
    public Pointer(){
        this(0,0);
    }
    public Pointer(double x, double y){
        this.x = x;
        this.y = y;
    }

    //x和y的get方法
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }

    //getDistance方法,给定参数x,y(另外一个点的坐标),或者给定对象Point c来表示这个点, 求出坐标点和圆的原点两点之间的距离
    //两点距离用来判断点是否在圆内
    public double getDistance(Pointer c){
        double deltX = this.x - c.x;
        double deltY = this.y - c.y;
        return Math.sqrt(Math.pow(deltX, 2) + Math.pow(deltY, 2));
    }
}
