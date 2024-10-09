package Queue.Demo1;

public class MyQueue {
   public Node head;//队头节点
   public Node cur;//当前节点
   public int size;//队列长度

    public class Node {
        public Object data;
        public Node next;

        public Node(Object data) {
            this.data = data;
        }
    }
        public void Add(Object ele){
            Node addNode = new Node(ele);//定义一个新节点用来存要加的元素ele
            if(head == null){
                head = addNode;
                head.next = null;
                cur = head;
            }
            else{
                cur.next = addNode;
                cur = cur.next;
            }
            size++;
        }

        public void Minus(int index){ //删除第几位元素


            if(size <= 0){
                throw new IllegalArgumentException();
            }
            else{
                if(index == 0){

                    head = head.next;
                }
                else if(index > 0 && index <= size){
                    int count = 0;
                    Node temp = head;
                    while(count != index){
                        temp = temp.next;
                        count++;
                    }
                    temp.next = temp.next.next;
                    size--;
                }
                else{
                    throw new IndexOutOfBoundsException();
                }
            }

        }

        public Object Search(int index){ //查找给的参数的位置的元素
            int count = 0;
            Node temp = head;

            if(index >= 0 && index <= size){
                while(count < index){
                    temp = temp.next;
                    count++;
                }
                return temp.data;
            }
            else{
                System.out.println("no such code");
                return null;
            }
        }

        public void Change(int index, Object ele){
            int count = 1;
            Node temp = head;
            if(index >= 0 && index  <= size){
                while(count != index){
                    temp = temp.next;
                    count ++;
                }
                temp.data = ele;
            }
            else{
                System.out.println("no such data");
            }
        }

    }




