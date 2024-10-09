package Weekend;

public class Bicycle extends Car {
    //无参构造
    public Bicycle(){
        this.setWheel(2);
        this.setSeat(2);
    }

    //重写父类继承构造
    public Bicycle(String brand, String color){
        super(brand, color);
    }

    public void printBicycle(){
        System.out.println("自行车类信息:" + "这是一辆" + this.getBrand() + "牌子的" + this.getColor() + "色自行车" );
    }
}
