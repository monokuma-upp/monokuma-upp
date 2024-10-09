package ArrayList;

public class pokeCard {
    //扑克牌的数字和花色
    private int rank;
    private String color;
    //构造函数
    public pokeCard(int rank,String color){
        this.rank = rank;
        this.color = color;
    }

    public pokeCard(String color){
        this.color = color;
    }

    @Override
    //打印扑克牌的花色和数字
    public String toString(){
        return "[" + rank + ", " + color + "]";
    }

}
