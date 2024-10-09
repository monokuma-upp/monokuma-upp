package Queue.Demo2;

public class LbMonkey {
    public int id;
    public String name;
    public LbMonkey next; //返回列表下一个元素节点

    public LbMonkey(){} //无参构造

    public LbMonkey(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("(%s,%s)",name,id);
    }
}
