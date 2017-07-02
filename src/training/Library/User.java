package training.Library;

import java.util.LinkedHashSet;

public class User extends Human {
    private static int nextId = 1;
    private int id;
    private LinkedHashSet<Book> books;


    public User() {
        super();
        setId();
        books = new LinkedHashSet<>();
    }

    public User(String name, String surname, int year, int month, int day, String phoneNumber,
                String address, String login, String password) {
        super(name, surname, year, month, day, phoneNumber, address, login, password);
        setId();
        books = new LinkedHashSet<>();
    }

    public static void setNextId(int nextId) {
        User.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public LinkedHashSet<Book> getBooks() {
        return books;
    }

    public void setBooks(LinkedHashSet<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "User: " +
                "\nName: " + getName() +
                "\nSurname: " + getSurname() +
                "\nBorn date: " + getBornDate().toString() +
                "\nPhone number: " + getPhoneNumber() +
                "\nAddress: " + getAddress() +
                "\nLogin: " + getLogin() + "\n";
    }
}
