package day05;

public class AddSum {
    public static void main(String[] args) {
        //1到100的累加和
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
