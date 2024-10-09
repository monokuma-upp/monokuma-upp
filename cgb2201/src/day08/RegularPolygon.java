package day08;

public class RegularPolygon {
    private Pointer point;
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon(){
        this(3, 1, 0, 0);
    }
    public RegularPolygon(int n, double side){
        this(n, side,0,0);
    }
    public RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.point = new Pointer(x, y);
    }

    public int getN(){
        return n;
    }
    public double getSide(){
        return side;
    }
    public Pointer getPointer(){
        return point;
    }

    public double getPerimeter(){
        return n * side;
    }
    public double getArea(){
        return (this.n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

}
