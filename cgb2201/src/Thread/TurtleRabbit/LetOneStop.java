package Thread.TurtleRabbit;

public class LetOneStop implements Animal.CallToBack {
    Animal an;

    public LetOneStop(Animal an){
        this.an = an;
    }

    @Override
    public void win(){
        an.stop();
    }
}
