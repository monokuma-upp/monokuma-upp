package day04;



public class ifElseDemo {
    public static void main(String[] args) {
        double price = 600.6;
        if(price >= 500){
            price *= .8;
        }
        else{
            price *= .9;
        }
        System.out.println("价格为" + price);

        int num = 8;
        if(num%2 == 0){
            System.out.println(num + " 是偶数");
        }
        else{
            System.out.println(num + " 是奇数");
        }
        System.out.println("继续执行");
    }

}
