package Weekend.buyDrink;

public class Coffee  extends Drink{
    private String mixture;
    public Coffee(){}

    public Coffee(String name, int volume, String mixture){
        super(name, volume);
        this.setMixture(mixture);
    }

    public void setMixture(String mixture){
        this.mixture = mixture;
    }
    public String getMixture(){
        return mixture;
    }

    @Override
    public void show(){
        System.out.println("您购买的饮料信息如下：");
        System.out.println("名称："+super.getName());
        System.out.println("添加配料："+this.getMixture());
        System.out.println("容量："+super.getVolume());
    }
}
