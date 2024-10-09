package Weekend.Fruit;

public class Banana extends Fruit{
    //私有属性variety
    private String variety;

    public Banana(){}

    public Banana(String shape, String taste, String variety){
        super(shape, taste);
        this.setVariety(variety);
    }

    public void setVariety(String variety){
        this.variety = variety;
    }

    public String getVariety(){
        return variety;
    }

    //创建无参无返回值的advantage方法，描述为：xx果形xx,果肉香甜，可供生食。
    public void advantage(){
        System.out.println(this.getVariety() + "果形" + this.getShape() + "，果肉" + this.getTaste() + "，可供生食。");
    }

    //重载要求(2)中的advantage方法（带参数color），描述为：xx颜色为xx
    public void advantage(String color){
        System.out.println(this.getVariety() + "颜色为" + color);
    }

}
