package Weekend.buyDrink;
import java.util.Scanner;
public class DrinkTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请选择饮料（1.咖啡  2 可乐  3 矿泉水）：");
        String choice = scan.next();
        Drink drink = DrinkFactory.getDrink(choice);
        drink.show();
    }
}
