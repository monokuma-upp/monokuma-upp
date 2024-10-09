package Queue.Demo3;

public class Node {
    Node prev; //前一个节点
    Node next;//后面一个节点
    int data;//节点里面的元素

    public Node(Node prev, Node next, int data){
        this.prev = prev;
        this.next = next;
        this.data = data;
    }
}
