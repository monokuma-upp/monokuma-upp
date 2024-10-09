package oop.day02.Company;

public class Employee {
    private String name;
    private int month;
    private HourlyEmployee hour;

    public Employee(){}

    public Employee(String name, int month){
        this.setName(name);
        this.setMonth(month);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public  void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }

    //根据参数月份来确定工资，如果该月员工过生日，则公司会额外奖励100 元。
    public double getSalary(int month){
        return (this.month == month)?100:0;
    }
}
