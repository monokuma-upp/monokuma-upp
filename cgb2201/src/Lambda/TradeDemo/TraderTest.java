package Lambda.TradeDemo;
//找出2011年发生的所有交易，并按交易额排序
//
//交易员在哪些不同的城市工作过
//
//查找所有来自剑桥的交易员，并按姓名排序
//
//返回所有交易员的姓名字符串，并按字母顺序排序
//
//有没有交易员在米兰工作的？
//
//打印生活在剑桥的交易员的所有交易额
//
//所有交易中，最高的交易额是多少
//
//找到交易额最小的交易

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TraderTest {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //找出2011年发生的所有交易，并按交易额排序
        //用lambda流中的filter方法来筛选2011年的交易，


        //交易员在哪些不同的城市工作过
    }
}
