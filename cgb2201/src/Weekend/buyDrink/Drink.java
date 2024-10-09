package Weekend.buyDrink;

public class Drink {
    private String name;
    private int volume;

    public Drink(){}

    public Drink(String name, int volume){
        this.setName(name);
        this.setVolume(volume);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }
    public int getVolume(){
        return volume;
    }

    public void show(){
        System.out.println("您购买的饮料信息如下：");
        System.out.println("名称："+name);
        System.out.println("容量："+volume);
    }
}
