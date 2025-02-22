package Generics;

public class MyDate {
    private int year, month, day;

    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year){
        this.year = year;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }

    public int getYear(){
        return  year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }

    @Override
    public String toString() {
        return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
    }


    public int compareTo(MyDate o){
        int yearMinus = year - o.getYear();
        if(yearMinus != 0){
            return yearMinus;
        }
        int monthMinus = month - o.getMonth();
        if(monthMinus != 0){
            return monthMinus;
        }
        return day - o.getDay();
    }
}
