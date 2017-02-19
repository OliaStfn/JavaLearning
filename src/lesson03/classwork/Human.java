package lesson03.classwork;


public class Human {
    private String name;
    private String surname;
    private int bornDay;
    private int bornMonth;
    private int bornYear;

    public Human() {
        name = "name";
        surname = "surname";
        bornDay = 1;
        bornMonth = 1;
        bornYear = 1920;
    }

    public Human(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBornDay() {
        return bornDay;
    }

    public void setBornDay(int bornDay) {
        this.bornDay = bornDay;
    }

    public int getBornMonth() {
        return bornMonth;
    }

    public void setBornMonth(int bornMonth) {
        this.bornMonth = bornMonth;
    }

    public int getBornYear() {
        return bornYear;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }


    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Birthday: " + bornDay + "." + bornMonth + "." + bornYear);
    }
}