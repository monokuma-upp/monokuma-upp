package Queue.Demo3;

public class Queue {
    private Node first; //队列的第一个（首部头）节点
    private Node last; //队列的尾部节点
    private int size = 0; //队列默认为空。长度为0

    public Queue(){}
    //增删改查 ：添加一个元素到数组，规则：添加到尾部
    public void add(int element){
        Node temp = last;//定义一个新的节点用来存尾部节点
        Node newNode = new Node(temp, null, element);//定义一个新的节点，插入到尾部，新的节点的上一个节点是
        last = newNode;
        if(temp == null){//如果尾部为空，那么首部也应该为空，是空队列
            first = newNode;
        }
        else{
            temp.next = newNode;
        }
        size++;
    }

    public int delete(){
        Node fNode = first;
        if(fNode == null){
            throw new IndexOutOfBoundsException();
        }
        int oldValue = first.data;
        first = first.next; //把第二个元素节点当作首部节点
        fNode = null;
        size--;
        return oldValue;
    }

    public void change(int index, int value){ //改变队列里特定位置的节点的元素值
        Node temp = first; //首部节点
        int count = 0;
        while(temp != null){
            if(count == index){
                temp.data = value;
            }
            temp = temp.next;
            count++;
        }

    }

    public int search(int value){ //查找特定的一个值并返回索引
        Node temp1 = first;
        int count = 0;
        while(temp1 != null){
            if(temp1.data == value){
                return count;
            }
            temp1 = temp1.next;
            count++;
        }
        return count;
    }

    public void show(){
        Node currentNode = first;
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < size; i++){
            sb.append(currentNode.data);
            if(i != size - 1){
                sb.append(",");
            }
            currentNode = currentNode.next;
        }
        sb.append("]");
        System.out.print(sb.toString());
    }

    public int getSize(){
        return size;
    }
}
