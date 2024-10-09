package Queue.Demo1;

public class Queue {
    private long arr[];
    private int MaxSize;
    private int front;
    private int rear;
    private int elements;

    public Queue(int size){
        this.MaxSize = size;
        arr = new long[MaxSize];
        front = 0;
        rear = -1;
        elements = 0;
    }

    public void show(){
        System.out.println(elements);
    }

    public long peek(){
        return arr[front];
    }

    public void add(int value){//在末尾加上一个元素
        arr[++ rear] = value;
        elements++;
    }

    public long remove(){
        long value = arr[front++];
        elements--;
        return value;
    }

    public boolean isEmpty(){
        return elements ==0;
    }

    public boolean isFull(){
        return elements == MaxSize;
    }


    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(53);
        q.add(54);
        q.add(9);

        while(!q.isEmpty()){
            System.out.println(q.remove() + " ");
        }

    }

}
