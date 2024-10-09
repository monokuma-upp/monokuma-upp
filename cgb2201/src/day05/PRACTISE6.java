package day05;

public class PRACTISE6 {
    public static void main(String[] args) {
        int sum = 0;
        int day;
        for(int i = 2000; i< 2008; i++){
            if((i%4 == 0&& i%100!= 0) || i%400 == 0){
                day = 366;
            }
            else{
                day = 355;
            }
            sum += day;
        }
        System.out.println(sum);
    }
}
