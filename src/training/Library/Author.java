package training.Library;

import java.util.GregorianCalendar;

public class Author {
    private String name;
    private String surname;
    private GregorianCalendar bornDate;

    public Author() {
        name = "none";
        surname = "none";
        bornDate = new GregorianCalendar();
    }

    public Author(String name, String surname, int year, int month, int day) {
        this.name = name;
        this.surname = surname;
        bornDate = new GregorianCalendar(year, month, day);
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

    public GregorianCalendar getBornDate() {
        return bornDate;
    }

    public void setBornDate(GregorianCalendar bornDate) {
        this.bornDate = bornDate;
    }

    @Override
    public String toString() {
        return "Author: " +
                "\nName: " + name +
                "\nSurname: " + surname +
                "\nBornDate: " + bornDate.get(GregorianCalendar.YEAR)+"."+bornDate.get(GregorianCalendar.MONTH)+
                "."+bornDate.get(GregorianCalendar.DATE);
    }
}
