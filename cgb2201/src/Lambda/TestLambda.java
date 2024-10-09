package Lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Consumer;
public class TestLambda {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(3,6,2,7,2,8,1,9);

        //获取对应的平方数
        List<Integer> squareNum = num.stream().map(i -> i*i)
                .sorted((x, y) -> y - x).collect(Collectors.toList());

        squareNum.forEach(System.out::println);

        //列表各元素加一
        squareNum.forEach(sn -> {sn ++;
            System.out.print(sn + " ");});

        System.out.println();
        List<String> strList = Arrays.asList("a","bv","fds","rqr","re","rt");
        Map<Integer,String> map = new HashMap<>();

        //字符串按长度从大到小排序
        List<String> newList = strList.stream().sorted((x,y) -> y.length() - x.length()).collect(Collectors.toList());
        newList.forEach((str) -> {
            System.out.print(str + " ");
        });

        //字符串根据字母排序
        List<String> reverseList = strList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        reverseList.forEach(System.out::println);

        //第一种lambda
        Runnable a1 = () -> System.out.println("lambda无参无返回值");
        a1.run();

        //第二种lambda
        Consumer<String> con = (x) -> System.out.println(x);
        con.accept("lambda有参无返回值");

        //第三种lambda
        Comparator<Integer> three = (x, y) -> {
            System.out.println("函数式接口");
            return Integer.compare(x,y);
        };

        //第四种lambda
        Comparator<Integer> com = (x,y) -> Integer.compare(x,y);
        System.out.println(com);

        //第五种

    }



}
