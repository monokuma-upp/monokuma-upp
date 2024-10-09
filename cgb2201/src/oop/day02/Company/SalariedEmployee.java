package oop.day02.Company;

public class SalariedEmployee  extends Employee{
    private double monthSalary;

    public SalariedEmployee(){}

    public SalariedEmployee(String name, int month, double monthSalary){
        super(name, month);
        this.setMonthSalary(monthSalary);
    }

    public void setMonthSalary(double monthSalary){
        this.monthSalary = monthSalary;
    }
    public double getMonthSalary(){
        return monthSalary;
    }

    @Override
    public double getSalary(int month){
        return monthSalary + super.getSalary(month);
    }
}
