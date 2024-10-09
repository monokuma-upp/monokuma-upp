package oop.day02.Company;

public class HourlyEmployee extends Employee {
    private double hourSalary;
    private int workHour;

    public HourlyEmployee(){}

    public HourlyEmployee(String name, int month, double hourSalary, int workHour){
        super(name, month);
        this.setHourSalary(hourSalary);
        this.setWorkHour(workHour);
    }

    public void setHourSalary(double hourSalary){
        this.hourSalary = hourSalary;
    }
    public double getHourSalary(){
        return hourSalary;
    }

    public void setWorkHour(int workHour){
        this.workHour = workHour;
    }
    public int getWorkHour(){
        return workHour;
    }

    @Override
    public double getSalary(int month){
        if(workHour <= 160 && workHour > 0){
            return hourSalary * workHour + super.getSalary(month);
        }
        return 160 * hourSalary + 1.5 * hourSalary *(workHour - 160) + super.getSalary(month);
    }
}
