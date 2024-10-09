package LinkedList;

public class newTitle {
    private String id;
    private String name;
    private String cjzhe;

    public newTitle(){ super(); };

    public newTitle(String id, String name, String cjzhe){
        this.id = id;
        this.name = name;
        this.cjzhe = cjzhe;
    }

    //访问器修改器
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setCjzhe(String cjzhe){
        this.cjzhe = cjzhe;
    }
    public String getCjzhe(){
        return cjzhe;
    }
}
