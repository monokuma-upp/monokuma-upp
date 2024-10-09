package Generics;

import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("jim",6000, new MyDate(1996,4,21));
        Employee e2 = new Employee("eric",5000, new MyDate(1998,8,01));
        Employee e3 = new Employee("rose",10000, new MyDate(1984,9,01));

    }
}
