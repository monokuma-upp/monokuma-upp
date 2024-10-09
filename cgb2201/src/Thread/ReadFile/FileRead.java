package Thread.ReadFile;
import java.io.File;

public class FileRead implements Runnable  {
    private String FileName;

    public FileRead(String FileName){
        this.FileName = FileName;
    }

    public void run(){
        File f = new File(FileName);
        if(f.exists() && f.isFile()){
            System.out.println("[" + FileName + "] length:" + f.length());
        }
        else{
            System.out.println("[" + FileName + "] not exists");
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            FileRead read = new FileRead("D:\\temp\\" + (i + 500) + ".txt");
            Thread thread = new Thread(read);
            thread.start();
        }
    }
}
