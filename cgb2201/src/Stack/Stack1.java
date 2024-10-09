package Stack;

//基于数组实现抽象类stack
public class Stack1 {
    private int size;
    private int top;
    private char[] stackArray;

    public Stack1(int size){ //构造一个数据类型为char的栈，初始化栈，由于栈内没有元素，所以top设置为-1
        stackArray = new char[size]; //定义一个数组
        top = -1;
        this.size = size;
    }

    public void push(char item){
        stackArray[++top] = item; //入栈，栈的下标+1
    }
    public int top(){
        return stackArray[top--];//出栈，删除栈顶元素，返回它，然后下标减一
    }
    public char seek(){ //查找栈顶元素，但是不删除
        return stackArray[top];
    }
    public boolean isEmpty(){ //判断栈是否为空
        return (top == -1);
    }
    public boolean isFull(){
        return top == size - 1;
    }


    public static void main(String[] args) {
        Stack1 stack = new Stack1(5);
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.push('e');

        char ch = stack.seek();
        System.out.println(ch);
    }
}
