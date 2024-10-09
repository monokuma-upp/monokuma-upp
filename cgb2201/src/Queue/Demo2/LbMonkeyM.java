package Queue.Demo2;

public class LbMonkeyM {
    public static void main(String[] args) {
        LbMonkey l1 = new LbMonkey(100,"jim");
        LbMonkey l2 = new LbMonkey(230,"jack");
        LbMonkey l3 = new LbMonkey(255,"sarah");
        LbMonkey l4 = new LbMonkey(57,"ben");

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = null;

        //便利队列然后打印每个节点
        LbMonkey node = l1;
        while(node != null){
            System.out.println(node);
            node = node.next;
        }

        System.out.println("------------------");

        //队伍新插入一个节点 l5;
        LbMonkey l5 = new LbMonkey(135,"dack");
        //重新插入必须是在队尾后面插入，先找到队尾的节点，然后点next把下一位设置成加入的元素
        LbMonkey tail = l1;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = l5;

        System.out.println("-----------");

        //如果要插入到第一个元素之后，第二个元素之前的话
        LbMonkey head = l1;
        l5.next = head.next;
        l1.next = l5;

        //如果插入在固定位置102后面,先找到102位的节点，再把103（102.next）等于 l5.next,最后再让 102.next = 插入元素l5
        LbMonkey head1 = l1;
        while(head1 != null){
            if(head1.id == 102){
                l5.next = head1.next;
                head1.next = l5;
                break;
            }
            head1 = head1.next;
        }


        //删除节点
        LbMonkey head2 = l1;
        while(head2 != null){
            if(head2.id == 105){
                head2.next = l5.next;
                break;
            }
            head2 = head2.next;
        }
    }
}
