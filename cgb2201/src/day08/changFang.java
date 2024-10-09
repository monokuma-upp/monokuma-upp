package day08;

public class changFang extends Rectangle{
    private int height;

    public changFang(int length, int width, int height){
        super(length, width);
        this.height = height;
    }
    public void print(){
        System.out.println("高：" + height);
    }
    public void volumn(){
        System.out.println(upArea());
        System.out.println("体积为: " + upArea() * height);
    }
}
