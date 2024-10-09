package Thread.Synchronize.FruitSale;

//新建一个Fruit类，
public class Fruit {
    //创建水果类的名字和价格
    private String name;
    private int price;
    private boolean isEmpty = true;
    public static int amount = 50;

    public Fruit(String name, int price, int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public Fruit(boolean isEmpty){
        this.isEmpty = isEmpty;
    }

    public void setEmpty(boolean isEmpty){
        this.isEmpty = isEmpty;
    }

    public int getPrice(){
        return price;
    }

    public int getAmount(){
        return amount;
    }

    @Override
    public String toString(){
      return "水果类：" + name + " 价格：" + price;
    }

    public boolean isEmpty(){
        if(amount < 0){
            return true;
        }
        else{
            return false;
            }
        }
    }

