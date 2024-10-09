package oop.day02.Company;

public class SalesEmployee extends  Employee{

    private double monthSale;
    private double addRate;

    public SalesEmployee(){}

    public SalesEmployee(String name, int month, double monthSale, double addRate){
        super(name, month);
        this.setMonthSale(monthSale);
        this.setAddRate(addRate);

    }

    public void setMonthSale(double monthSale){
        this.monthSale = monthSale;
    }
    public double getMonthSale(){
        return monthSale;
    }
    public void setAddRate(double addRate){
        this.addRate = addRate;
    }
    public double getAddRate(){
        return addRate;
    }

    @Override
    public double getSalary(int month){
        return monthSale * (1 +(addRate * 0.01)) + super.getSalary(month);
    }
}
