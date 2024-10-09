package Weekend.Fruit;

public class FruitTest {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("圆形", "甜的");
        Fruit f2 = new Fruit("圆形", "甜的");

        f1.eat();
        System.out.println("f1和f2的比较 : " + f1.equals(f2));

        WaxBerry berry = new WaxBerry("椭圆","酸的","红紫色");
        berry.face();
        berry.eat();
        String s = berry.toString();
        System.out.println(s);

        Banana ba = new Banana("圆柱形", "苦的","皇帝蕉");
        ba.advantage();
        ba.advantage("黄的");
    }
}
