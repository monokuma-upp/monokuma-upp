package oop.day04;
import java.util.Random;
public class SoliderTest {
    public static void main(String[] args) {
        Solider s = new Solider(45,100);
        for(int i = 1; i < new Random().nextInt(10); i++){
            s.attack();
        }
        System.out.println(s.getBlood());
    }
}
