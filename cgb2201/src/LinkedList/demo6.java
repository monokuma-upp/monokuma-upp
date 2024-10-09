package LinkedList;
import java.util.LinkedList;
import java.util.Random;
//请随机生成一注双色球号码。(要求同色号码不重复)。双色球规则:
// 双色球每注投注号码由 6 个红色 球号码和 1 个蓝色球号码组成。
// 红色球号码从 1—33 中选择;蓝色球号码从 1—16 中选择;
public class demo6 {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        System.out.println(randomPrize(num));
    }

    public static LinkedList<Integer> randomPrize(LinkedList<Integer> redList){
       int blue = new Random().nextInt(15) + 1;
       LinkedList<Integer> res = new LinkedList<>();
        for(int i = 1; i <= 6; i++){
            redList.add(new Random().nextInt(32) + 1);
        }

        for(int i = 0; i < redList.size(); i++){
            if(res.contains(redList.get(i))){
                continue;
            }
            res.add(redList.get(i));
        }
        //判断是否重号
        res.add(blue);
        return res;
    }
}
