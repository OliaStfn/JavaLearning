package training.Library;

import java.util.Scanner;

public class Admin extends Human {
    private static int nextId;
    private int id;
    private double rating;
    private int countMark;

    public Admin() {
        super();
        setId();
        rating = 0;
        countMark = 0;
    }

    public Admin(String name, String surname, int year, int month, int day, String phoneNumber,
                 String address, String login, String password) {
        super(name, surname, year, month, day, phoneNumber, address, login, password);
        setId();
        this.rating = rating;
        this.countMark = countMark;
    }


    public static void setNextId(int nextId) {
        Admin.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getCountMark() {
        return countMark;
    }

    public void setCountMark(int countMark) {
        this.countMark = countMark;
    }

    public void addMark() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter mark for this administrator: (from 1 to 5)");
            int mark = Integer.parseInt(in.next());
            if (mark < 0 || mark > 5) {
                throw new NumberFormatException("Error. Mark<0 or Mark>5");
            }
            rating = (rating * countMark + mark) / countMark + 1;
            countMark++;
        } catch (NumberFormatException e) {
            e.getMessage();
        }
    }

    @Override
    public String toString() {
        return "Administrator: " +
                "\nName: " + getName() +
                "\nSurname: " + getSurname() +
                "\nBorn date: " + getBornDate().toString() +
                "\nPhone number: " + getPhoneNumber() +
                "\nAddress: " + getAddress() +
                "\nRating: " + rating +
                "\nLogin: " + getLogin() + "\n";
    }
}
