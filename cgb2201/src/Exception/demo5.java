package Exception;
import java.lang.Exception;
import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三角形三条边： ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        try{
            Sanj sj = new Sanj(x,y,z);
            System.out.println("三角形面积为P: " + sj.getArea());
            sj.showInfo();
        }
        catch(Exception e){
            System.out.println("x,y,z 不能构成三角形");
        }
    }
}

class Sanj{
    private int x, y ,z;

    public Sanj(int x, int y, int z) throws SanjException{
        this.x = x;
        this.y = y;
        this.z = z;
        try {
            if ((x >= y + z) || (x <= Math.abs(y - z)) || (y >= x + z) || (y <= Math.abs(x - z)) || (z >= y + x) || (z <= Math.abs(y - x)) || (x == 0) || (y == 0) || (z == 0)) {
                throw new Exception("不能構成三角形");
            }
        }
            catch(Exception e){
                System.err.println("Exception handled in the method SjException");
                throw new SanjException("出现异常",e);
            }
        }


    public double getArea(){
        return Math.sqrt(((1/16)*(x+y+z)*(x+y-z)*(x+z-y)*(y+z-x)));
    }

    public void showInfo(){
        System.out.println("三邊長分別為: " + x + y + z);
    }
}

class SanjException extends Exception{

public SanjException(String message, Throwable cause){
    super(message, cause);
}
public  SanjException(String message){
    super(message);
}
public SanjException(Throwable cause){
    super(cause);
}
}
