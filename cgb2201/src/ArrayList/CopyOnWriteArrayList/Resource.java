package ArrayList.CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.List;

public class Resource {
    public static void main(String[] args) throws InterruptedException{
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //不可变
        final ArrayList<String> strList = new ArrayList<String>(list);
        Thread t = new Thread(new Runnable() {
            //Runnable代码块
            int count = -1;

            @Override
            public void run(){
                while(true){
                    strList.add(count++ + " ");
                }
            }
        });
        t.setDaemon(true);
        t.start();
        Thread.currentThread().sleep(3);
        for(String s : strList){
            System.out.println(s);
        }
    }
}
