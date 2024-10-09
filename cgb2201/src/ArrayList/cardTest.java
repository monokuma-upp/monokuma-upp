package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class cardTest {
    //定义玩家手牌
    //其中1是A，2是2,11是J，12是Q,13是K
    public static void main(String[] args) {
        //买牌
        ArrayList<pokeCard> arr = buyCard.doBuyCard();
        arr.add(new pokeCard("小王"));
        arr.add(new pokeCard("大王"));

        System.out.println("买牌:" + arr);
        //洗牌
        buyCard.shuffle(arr);
        System.out.println("洗牌" + arr);
        //发牌

        ArrayList<pokeCard> player1 = new ArrayList<>();
        ArrayList<pokeCard> player2 = new ArrayList<>();
        ArrayList<pokeCard> player3 = new ArrayList<>();


        Iterator<pokeCard> e = arr.iterator();
        //依次给三个玩家发牌，按照123123123的循环方式把牌存到三个不同的玩家列表中
        int i = 0;
        while(i < arr.size()){
            player1.add(arr.get(i));
            player2.add(arr.get(i + 1));
            player3.add(arr.get(i + 2));
            i+=3;
        }

        System.out.println("玩家1：" + player1);
        System.out.println("玩家2：" + player2);
        System.out.println("玩家3：" + player3);

        //玩家1，玩家2，玩家3也可以玩德州扑克，每次发四张牌，玩家123

    }
}
