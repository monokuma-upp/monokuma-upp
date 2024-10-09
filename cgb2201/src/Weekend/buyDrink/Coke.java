package Weekend.buyDrink;

public class Coke extends Drink {
    public Coke(){}

    public Coke(String name, int volume){
        super(name, volume);
    }

    public boolean isCoke(int choice){
        if(choice ==1){
            return true;
        }
        return false;
    }
}
