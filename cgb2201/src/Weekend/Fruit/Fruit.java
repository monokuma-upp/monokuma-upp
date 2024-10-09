package Weekend.Fruit;

public class Fruit {
    private String shape;
    private String taste;

    public Fruit(){}
    public Fruit(String shape, String taste){
        this.setShape(shape);
        this.setTaste(taste);
    }

    public void eat(){
        System.out.println("水果可供人们食用！");
    }

    public void setShape(String shape){
        this.shape = shape;
    }
    public String getShape(){
        return shape;
    }

    public void setTaste(String taste){
        this.taste = taste;
    }
    public String getTaste(){
        return taste;
    }

    //重写equals方法
    @Override
    public boolean equals(Object obj){
        //如果给的对象与Fruit类的对象相等,则返回真
        if(this == obj){
            return true;
        }
        //如果给的对象为空,则返回假
        if(obj == null){
            return false;
        }
        //getClass获取运行时的类型,与obj相比较
        if(getClass() != obj.getClass()){
            return false;
        }
        //把obj对象转化为Fruit类, other
        Fruit other = (Fruit) obj;
        if(shape == null){
            if(other.shape != null){
                return false;
            }
        }
        else if(! shape.equals(other.shape)){
            return false;
        }
        if(taste == null){
            if(other.taste != null){
                return false;
            }
            else if(!taste.equals(other.taste)){
                return false;
            }
        }
        return true;
    }
}
