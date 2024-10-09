package Weekend.buyDrink;
import java.util.Scanner;

public class DrinkFactory {
    public static Drink getDrink(String no) {
        Scanner scan = new Scanner(System.in);
        Drink drink = null;
        int choice = 0;
        int volume = 0;
        if ("1".equals(no)) {
            System.out.println("请输入购买容量：");
             volume = scan.nextInt();
            System.out.println("请问是否要配料（1、加糖 2、加奶 3、什么也不加）");
             choice = scan.nextInt();
            String mixture;
            switch (choice) {
                case 1:
                    mixture = "加糖";
                    break;
                case 2:
                    mixture = "加奶";
                    break;
                default:
                    mixture = "什么都不加";
            }

            drink = new Coffee("咖啡", volume, mixture);

        }
        else if("2".equals(no)){
            System.out.println("请输入购买容量：");
             volume = scan.nextInt();
            System.out.println("请问需要可口可乐（0）还是百事可乐？（1）");
            choice = scan.nextInt();
            if(choice == 0){
                drink = new Coke("可口可乐", volume);
            }
            else{
                drink = new Coke("百事可乐", volume);
            }
        }
        else if("3".equals(no)){
            System.out.println("请输入购买容量：");
             volume = scan.nextInt();
            drink = new Water("矿泉水", volume);
        }
        return drink;
    }
}
