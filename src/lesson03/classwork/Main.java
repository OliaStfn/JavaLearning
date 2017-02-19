package lesson03.classwork;

public class Main {
    public static void main(String[] args) {
        Human obj = new Human();
        Human object = new Human("John", "Brown");
        obj.setBornDay(22);
        obj.setBornMonth(3);
        obj.setBornYear(1999);
        obj.setName("Olia");
        obj.setSurname("Stefanyshyn");
        int day = object.getBornDay();
        int month = object.getBornMonth();
        int year = object.getBornYear();
        String  name= object.getName();
        String  surname= object.getSurname();

        // new test connection
        // new line 2

        obj.showInfo();
        object.showInfo();
    }
}
