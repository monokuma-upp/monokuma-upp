package Generics;

public class Employee {
    private String name;
    private double salary;
    private MyDate mydate;

    public Employee(MyDate mydate){
        this.mydate = mydate;
    }

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, double salary, MyDate myDate){
        this.name = name;
        this.salary = salary;
        this.mydate = myDate;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setMyDate(MyDate mydate){
        this.mydate = mydate;
    }

    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public MyDate getMyDate(){
        return mydate;
    }

    @Override
    public String toString() {
        return "\nEmployee [name=" + name + ", sal=" + salary + ", birthday=" + mydate + "]";//  \n换行
    }

}
