package Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentTest {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<String, Student>();

        Student s1 = new Student("大熊", 18);
        Student s2 = new Student("静香", 19);
        Student s3 = new Student("胖虎", 20);

        map.put("S123", s1);
        map.put("S223", s2);
        map.put("S323", s3);

        Set<String> set = map.keySet();
        for(String key: set){
            Student value = map.get(key);
            System.out.println(key + ", " + value.getName() + "," + value.getAge());
        }

        System.out.println("----------------");

        Set<Map.Entry<String, Student>> entrySet = map.entrySet();
        for(Map.Entry<String, Student> me : entrySet){
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key + ", " + value.getName() + "," + value.getAge());
        }
    }
}
