package day05;
import java.util.Random;
public class PRACTISE5 {
    public static void main(String[] args) {
        for(int i = 0; i <10; i++){
            Random rd = new Random();
            int num = rd.nextInt(3);
            switch(num){
                case 0:
                    System.out.println("白猪");
                    break;
                case 1:
                    System.out.println("黑猪");
                    break;
                case 2:
                    System.out.println("红猪");
                    break;
                default:
                    break;
            }
        }
    }
}
