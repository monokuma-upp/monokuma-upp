package Weekend;

public class CarTest {
    public static void main(String[] args) {
       Car c = new Car("天宇", "黄", 4,5);
       c.print();
       Bicycle b = new Bicycle("山地", "黑");
       b.printBicycle();
       MotorCycle m = new MotorCycle("南孚");

       m.printMotorCycle();
       TriCycle t = new TriCycle();

       t.printTriCycle();
    }
}
