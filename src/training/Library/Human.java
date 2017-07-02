package training.Library;

import java.time.LocalDate;

public class Human {
    private String name;
    private String surname;
    private LocalDate bornDate;
    private String phoneNumber;
    private String address;
    private String login;
    private String password;

    public Human() {
        name = "none";
        surname = "none";
        bornDate = LocalDate.now();
        phoneNumber = "none";
        address = "none";
        login = "root";
        password = "0000";
    }

    public Human(String name, String surname, int year, int month, int day, String phoneNumber, String address, String login, String password) {
        this.name = name;
        this.surname = surname;
        bornDate = LocalDate.of(year, month, day);
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.login = login;
        this.password = password;
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

    public LocalDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
