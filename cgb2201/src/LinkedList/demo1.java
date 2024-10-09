package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class demo1 {
    public static void main(String[] args) {
        newTitle nk = new newTitle("1","汽车","管理员");
        newTitle nk1 = new newTitle("2","医学","管理员");
        newTitle nk2 = new newTitle("3","娱乐","管理员");
        newTitle nk3 = new newTitle("4","体育","管理员");

        List<newTitle> list = new LinkedList<>();
        list.add(nk);
        list.add(nk1);
        list.add(nk2);
        list.add(nk3);

        for(Object o: list){
            newTitle ko = (newTitle)(o);
            System.out.println(ko.getName());
        }
        System.out.println("---------------");

        list.remove(0);
        list.remove(list.size());


    }

}
