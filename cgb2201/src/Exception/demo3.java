package Exception;
import java.util.Scanner;
public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarBoat b = new CarBoat();
        b.setMaxContent(1000);
        int count = 0;
        try{
            while(true){
                count = sc.nextInt();
                b.loading(count);
            }
        }
        catch(DangerException e){
            e.showError();
            System.out.printf("无法再装载重量是%d吨的集装箱\n", count);
        }
        finally {
            System.out.println("货船将正点启航");
        }
    }
}

class DangerException extends Exception{
    public void showError(){
        System.out.println("超重");
    }
}

class CarBoat{
    int realContent;
    int maxContent;

    void setMaxContent(int c){
        maxContent = c;
    }

    public void loading(int m) throws DangerException{
        realContent += m;
        if(realContent > maxContent) throw new DangerException();
        System.out.printf("目前装载了%d吨货物\n",realContent);

    }
}


