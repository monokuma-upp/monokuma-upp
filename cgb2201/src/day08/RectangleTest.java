package day08;

public class RectangleTest {
    public static void main(String[] args) {
        changFang cf = new changFang(2,3,5);
        cf.print();
        System.out.println("底面积为: " + cf.upArea());
        cf.volumn();
    }
}
