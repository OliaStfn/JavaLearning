package training;

import java.util.Scanner;

public class Human {
    private int count;
    private double mark;
    private double rating;

    public void addMarks() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter mark: ");
            mark = in.nextInt();
            rating = (rating * count + mark) / count;
        } catch (Exception e) {
            e.getMessage();
        }

    }

}
