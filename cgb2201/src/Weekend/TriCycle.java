package Weekend;

public class TriCycle extends Car {
    public TriCycle(){
        super();
        this.setSeat(4);
        this.setWheel(3);
    }

    public void printTriCycle(){
        System.out.println("三轮车类测试信息: 三轮车是一款拥有" + this.getWheel() + "个轮子的非机动车" );
    }

}
