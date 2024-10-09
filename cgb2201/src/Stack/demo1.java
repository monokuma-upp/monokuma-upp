package Stack;

import java.util.EmptyStackException; //异常类型
import java.util.Stack;	//栈类的引用

public class demo1 {
    static void showPush(Stack<Integer> st, int data){
        st.push(new Integer(data));
        System.out.println("push("+ data +")");
        System.out.println("stack: "+ st);
    }

    static void showPop(Stack<Integer> st){
        System.out.print("pop-> ");
        Integer a = (Integer)st.pop();
        System.out.println(a);
        System.out.println("stack-" + st);
    }

    public static void main(String[] args) {
        Stack <Integer> st = new Stack<Integer>(); //Integer 类型的栈
        System.out.println("stack:" + st);

        showPush(st,1);
        showPush(st,2);
        showPush(st,3);
        showPop(st);
        showPop(st);
        showPop(st);
    }
}
