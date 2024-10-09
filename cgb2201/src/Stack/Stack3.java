package Stack;

import java.util.EmptyStackException;
//基于链表实现栈
class Link{
    public char data;
    public Link next; //下一个节点
    public void show(){
        System.out.println(data + " ");
    }
    public Link(char data){
        this.data = data;
    }
}

public class Stack3 {
    Link head;
    public int size;
    public int top;
    public static char[] stackArray;

    public void push(char data){ //入栈
        if(head == null){ //如果链表为空
            head = new Link(data);
        }
        else{
            Link node = new Link(data);
            node.next = head;
            head = node;
        }
    }

    public void pop(){
        if(head == null){
            throw new EmptyStackException();
        }
        char num = head.data;
        head.show();
        head = head.next;
    }
    public int top(){
        if(head == null){
            return 0;
        }
        else{
            return head.data;
        }
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Stack3 stack = new Stack3();
        stack.push('A');
        stack.push('B');
        stack.push('C');
        stack.push('D');
        stack.push('E');
        stack.push('F');
        stack.pop();

    }
}
