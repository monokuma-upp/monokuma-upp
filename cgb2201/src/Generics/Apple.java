package Generics;

public class Apple<T> {
    private T weight;

    public Apple(T weight){
        this.weight = weight;
    }

    public void setWeight(T weight){
        this.weight = weight;
    }

    public T getWeight(){
        return weight;
    }
    @Override
    public String toString(){
        return "苹果的重量是" + weight;
    }
}
