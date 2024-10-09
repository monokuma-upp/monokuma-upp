package Thread.TurtleRabbit;

public class MainTest {
    public static void main(String[] args) {
        Turtle t = new Turtle();
        Rabbit r = new Rabbit();

        LetOneStop letOneStop1 = new LetOneStop(t);
        LetOneStop letOneStop2 = new LetOneStop(r);
        r.callToBack = letOneStop1;
        t.callToBack = letOneStop2;

        t.start();
        r.start();


    }
}
