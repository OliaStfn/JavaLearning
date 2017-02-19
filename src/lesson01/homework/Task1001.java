package lesson01.homework;

import java.util.Scanner;

public class Task1001 {
    public static void main(String[] args) {
        double d, x1, x2, y1, y2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x1: ");
        x1 = in.nextDouble();
        System.out.println("Enter x2: ");
        x2 = in.nextDouble();
        System.out.println("Enter y1: ");
        y1 = in.nextDouble();
        System.out.println("Enter y2: ");
        y2 = in.nextDouble();

        d = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        System.out.println("d=" + d);
    }
}