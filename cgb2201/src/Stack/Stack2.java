package Stack;

//基于动态数组实现抽象类stack
public class Stack2 {
    public int size;
    public int top;
    public static char[] stackArray;

    public Stack2(int size){
        this.size = size;
        top = -1;
        stackArray = new char[size];
    }

    public void push(char item){
        if(isFull()){
            doubleStack();
        }
        stackArray[++top] = item;
    }

    //模拟数组的扩容
    public void doubleStack(){
        char[] stackNewArray = new char[size * 2];
        for(int i = 0; i < size; i++){
            stackNewArray[i] = stackArray[i];
        }
        size = size * 2;
        stackArray = stackNewArray;
    }

    //出栈，删除栈顶元素，栈顶元素的下标-1
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return 0;
        }
        else{
            return stackArray[top--];
        }
    }

    ////查看栈顶元素，不删除
    public char find(){
        return stackArray[top];
    }

    //判空
    public boolean isEmpty(){
        return top == -1;
    }

    //判满
    public boolean isFull(){
        return top == size - 1;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0; i < stackArray.length; i++){
            if(i == stackArray.length - 1) {
                s.append(stackArray[i]);
                continue;
            }
            s.append(stackArray[i] + ", ");
        }
        s.append("]");
        return s.toString();
    }

    public static void main(String[] args) {
        Stack2 stack = new Stack2(5);
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.push('e');
        System.out.println(stack.toString());

    }
}
