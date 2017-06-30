package training.Library;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Library {
    private HashSet<Department> departments;
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<User> users;
    private ArrayList<Admin> admins;

    public Library() {
        departments = new HashSet<>();
        name = "none";
        address = "none";
        phoneNumber = "none";
        users = new ArrayList<>();
        admins = new ArrayList<>();
    }

    public Library(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        departments = new HashSet<>();
        users = new ArrayList<>();
        admins = new ArrayList<>();
    }

    public HashSet<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(HashSet<Department> departments) {
        this.departments = departments;
    }

    public void addDepartment(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter name for department: ");
        String name=in.nextLine();
        departments.add(new Department(name));
    }

    public Department deleteDepartment(){
        Scanner in= new Scanner(System.in);
        Department department= null;
        for (Department department1: departments){
            System.out.println(department1.toString());
        }
        System.out.println("Enter name of department which you want to delete: ");
        String name=in.nextLine();
        for (Department department1: departments){
            if(name==department1.getName()){
                department=department1;
                departments.remove(department1);
            }
        }
        return department;
    }

    public void addBookToDepartment(){
        Scanner in=new Scanner(System.in);
        for (Department department: departments){
            System.out.println(department.toString());
        }
        System.out.print("Enter name of department which you want to add book to: ");
        String name=in.nextLine();
        for(Department department:departments){
            if(name==department.getName()){
                department.addBook();
            }
        }
    }

    public Book takeBookFromDepartment(){
        Scanner in=new Scanner(System.in);
        for(Department department: departments){
            System.out.println(department.toString());
        }
        System.out.print("Enter name of department which you want to take book from: ");
        String name=in.nextLine();
        for (Department department: departments){
            if(name==department.getName()){
                return department.takeBook();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(ArrayList<Admin> admins) {
        this.admins = admins;
    }

    @Override
    public String toString() {
        return "Library: " +
                "\nDepartments: " + departments +
                "\nName: " + name +
                "\nAddress:" + address +
                "\nPhone number: " + phoneNumber +
                "\nUsers: " + users +
                "\nAdmins: " + admins;
    }
}
