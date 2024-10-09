package oop.day02.Company;

public class BasePlusSalesEmployee extends SalesEmployee {

    private double baseSalary;

    public BasePlusSalesEmployee(){}

    public BasePlusSalesEmployee(String name, int month, double monthSale, double addRate, double baseSalary){
        super(name, month, monthSale, addRate);
        this.setBaseSalary(baseSalary);
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary(){
        return baseSalary;
    }

    public double getSalary(int month){
        return baseSalary + super.getSalary(month);
    }
}
