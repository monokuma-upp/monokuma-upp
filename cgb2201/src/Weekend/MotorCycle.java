package Weekend;

public class MotorCycle extends Car {
    private String battery;

    public MotorCycle(){
        this.setWheel(2);
        this.setSeat(2);
    }
    public MotorCycle(String battery){
        super();
        this.battery = battery;
    }

    public void setBattery(){
        this.battery = battery;
    }
    public String getBattery(){
        return battery;
    }
    public void printMotorCycle(){
        System.out.println("电动车类型信息:" + "这是一辆使用" + this.getBattery() + "牌电池的电动车");
    }
}
