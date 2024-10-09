package Weekend.Fruit;

public class WaxBerry extends Fruit{
    private String color;
    public WaxBerry(){ }

    public WaxBerry(String shape, String taste, String color){
        super(shape, taste);
        this.setColor(color);
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    //创造不允许重写的face方法
    public final void face(){
        System.out.println("杨梅：" + this.getColor() + "、" + this.getShape() + "，" + "果味" + this.getTaste() + "。");
    }

    //重写父类eat方法
    @Override
    public void eat(){
        System.out.println("杨梅酸甜适中，非常好吃！");
    }

    //重写toString方法，输出的表现形式不同（输出shape,color,taste）
    @Override
    public String toString(){
        return "杨梅的信息：果实为" + this.getShape() + "、" + this.getColor() + "，" + this.getTaste() + "，非常好吃！";
    }
}
