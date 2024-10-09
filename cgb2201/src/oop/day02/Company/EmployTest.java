package oop.day02.Company;

public class EmployTest {
    public static void main(String[] args) {
        SalariedEmployee salary = new SalariedEmployee("Jim", 8,8000);
        HourlyEmployee hour = new HourlyEmployee("Rick", 3,80,270);
        SalesEmployee sale = new SalesEmployee("Mary",12,7000,15);
        BasePlusSalesEmployee base = new BasePlusSalesEmployee("Ami", 5,6000,15,2000);

        System.out.println(salary.getName() + " 的工资是" + salary.getSalary(8));
        System.out.println(hour.getName() + " 的工资是" + hour.getSalary(8));
        System.out.println(sale.getName() + " 的工资是" + sale.getSalary(8));
        System.out.println(base.getName() + " 的工资是" + base.getSalary(8));

    }
}
