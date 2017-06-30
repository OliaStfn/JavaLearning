package training.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {
    private String name;
    private ArrayList<Book> books;
    private int quantityBooks;

    public Department() {
        name = "none";
        quantityBooks = 0;
        books = new ArrayList<>();
    }

    public Department(String name) {
        this.name = name;
        quantityBooks = 0;
        books = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter book name: ");
        String name = in.nextLine();
        System.out.print("Enter book genre: ");
        String genre = in.nextLine();
        System.out.print("Enter book description: ");
        String description = in.nextLine();
        System.out.print("Enter ISBN: ");
        String ISBN = in.nextLine();
        System.out.print("Enter quantity pages of book: ");
        int quantityPage = Integer.parseInt(in.next());
        System.out.print("Enter edition: ");
        String edition = in.nextLine();
        System.out.print("Enter year of printing: ");
        int year = Integer.parseInt(in.next());
        System.out.print("Enter month of printing: ");
        int month = Integer.parseInt(in.next());
        System.out.print("Enter day of printing: ");
        int day = Integer.parseInt(in.next());
        Book book = new Book(name, genre, description, ISBN, quantityPage, edition, year, month, day);
        book.addAuthor();
        int temp = -1;
        do {
            System.out.print("Do you want to add other author?1- Yes, 0- No");
            temp = Integer.parseInt(in.next());
            if (temp == 1) {
                book.addAuthor();
            }
        } while (temp != 0);

        books.add(book);

    }

    public Book takeBook() {
        Scanner in = new Scanner(System.in);
        Book book = null;
        for (Book book1 : books) {
            System.out.println(book1.toString());
        }
        System.out.print("Enter name of book which you want to take: ");
        String name = in.nextLine();
        for (Book book1 : books) {
            if (name == book1.getNameBook()) {
                book = book1;
            }
        }
        return book;
    }

    public int getQuantityBooks() {
        return quantityBooks;
    }

    public void setQuantityBooks(int quantityBooks) {
        this.quantityBooks = quantityBooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
