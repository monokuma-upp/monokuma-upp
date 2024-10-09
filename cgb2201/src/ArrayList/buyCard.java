package ArrayList;

import java.util.ArrayList;

public class buyCard {
    //定义扑克牌的花色，存在一个数组中
    //然后把所有牌存在一个列表里
    private static final String[] units = {"♥","♠","♣","♦"};

    public static ArrayList<pokeCard> doBuyCard(){
        ArrayList<pokeCard> cards = new ArrayList<>();
        //第一个循环遍历四个花色，第二个循环遍历13张牌，13X4 = 52等于整幅牌
        for(int i = 0; i < 4; i++){
            for(int j = 1; j <= 13; j++){
                //String s = units[i]; //花色数组
                //int rank = j;
               // pokeCard card = new pokeCard(rank, s);
                //cards.add(card);
                cards.add(new pokeCard(j, units[i]));

            }
        }
        return cards;
    }

    //洗牌,一个列表数组52张牌，升序排列，由花色区别
    public static void shuffle(ArrayList<pokeCard> cards){
        pokeCard temp;

        //遍历整个列表，定义一个随机数来表示
        for(int i = 0; i <cards.size(); i++){
            //定义一个随机整数：列表的随机索引
            int m = (int)(Math.random() * (cards.size()));
            //定义temp为第i个pokecard
            temp = cards.get(i);
            //把第i个元素设置成第m个元素随机的
            cards.set(i, cards.get(m));
            //把第m个元素设置成第i个元素，实现两个元素：第i个元素和第m个随机元素交换
            cards.set(m, temp);
            }
        }


    }

