package training.Library;

import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Scanner;

public class Book {
    private String nameBook;
    private String genre;
    private String description;
    private String ISBN;
    private int quantityPage;
    private String edition;
    private HashSet<Author> authors;
    private GregorianCalendar yearOfPrinting;

    public Book() {
        nameBook = "none";
        genre = "none";
        description = "none";
        ISBN = "0000-0000";
        quantityPage = 0;
        edition = "none";
        authors = new HashSet<Author>();
        yearOfPrinting = new GregorianCalendar();
    }

    public Book(String nameBook, String genre, String description, String ISBN, int quantityPage, String edition,
                int year, int month, int day) {
        this.nameBook = nameBook;
        this.genre = genre;
        this.description = description;
        this.ISBN = ISBN;
        this.quantityPage = quantityPage;
        this.edition = edition;
        authors = new HashSet<Author>();
        yearOfPrinting = new GregorianCalendar(year, month, day);
    }

    public Book(String nameBook, String genre, String description, String ISBN, int quantityPage, String edition,
                int year, int month, int day, String name, String surname, int bornYear, int bornMonth, int bornDay) {
        this.nameBook = nameBook;
        this.genre = genre;
        this.description = description;
        this.ISBN = ISBN;
        this.quantityPage = quantityPage;
        this.edition = edition;
        authors = new HashSet<Author>();
        authors.add(new Author(name, surname, bornYear, bornMonth, bornDay));
        yearOfPrinting = new GregorianCalendar(year, month, day);
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getQuantityPage() {
        return quantityPage;
    }

    public void setQuantityPage(int quantityPage) {
        this.quantityPage = quantityPage;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public HashSet<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(HashSet<Author> authors) {
        this.authors = authors;
    }

    public void addAuthor() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter author name: ");
        String name = in.nextLine();
        System.out.print("Enter author surname: ");
        String surname = in.nextLine();
        System.out.print("Enter author`s born year: ");
        int year = Integer.parseInt(in.next());
        System.out.print("Enter author`s born month: ");
        int month = Integer.parseInt(in.next());
        System.out.print("Enter author`s born day: ");
        int day = Integer.parseInt(in.next());
        authors.add(new Author(name, surname, year, month, day));
    }

    public GregorianCalendar getYearOfPrinting() {
        return yearOfPrinting;
    }

    public void setYearOfPrinting(GregorianCalendar yearOfPrinting) {
        this.yearOfPrinting = yearOfPrinting;
    }

    @Override
    public String toString() {
        String temp = "";
        for (Author author : authors) {
            temp += author.toString() + "\n";
        }
        return "Book: " +
                "\nName: " + nameBook +
                "\nGenre: " + genre +
                "\nDescription: " + description +
                "\nISBN: " + ISBN +
                "\nQuantity Page: " + quantityPage +
                "\nEdition: " + edition +
                "\nAuthors: " + authors +
                "\nYear of printing: " + yearOfPrinting;
    }
}
