package Vector;

import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Object o;
        int score = 0;
        int subNum = 0;
        int temp = 0;

        Vector Student = new Vector(1, 1);

        Student.addElement("张三");
        Student.addElement("1314");
        Student.addElement("男");
        Student.addElement(95);
        Student.addElement(65);
        Student.addElement(75);
        Student.addElement(69);
        Student.addElement(55);
        Student.addElement(59);
        Student.addElement(73);

        for(int i =0; i < Student.size(); i++){
            o = Student.elementAt(i);
            if(o instanceof Integer){
                score+= (int)Student.elementAt(i);
                subNum ++;
            }
        }

        for(int j = 3; j < Student.size() - 1; j++){
            if((int)Student.elementAt(j) < (int)Student.elementAt(j + 1)){
                temp = (int)Student.elementAt(j + 1);
                Student.setElementAt((int)Student.elementAt(j), j + 1);
                Student.setElementAt(temp, j);
            }
        }
        System.out.println(subNum+" 科平均分是："+(double)(score/subNum));
        System.out.println(Student);
    }
}
