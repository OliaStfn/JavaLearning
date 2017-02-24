package lesson03.classwork;

public class Date {
    // start task4001
private int day,month,year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public Date (int day,int month, int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public void showDate(){
        System.out.println("Date: "+day+"."+month+"."+year);
    }
    //finish task4001
}


