package Thread.Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeUtil {

    public static void saveObject(Object object) throws Exception{
        ObjectOutputStream out = null;
        FileOutputStream fout = null;

        try{
            fout = new FileOutputStream("D:/1.txt");
            out = new ObjectOutputStream(fout);
            out.writeObject(object);
        }
        finally{
            fout.close();
            out.close();
        }
    }
}
