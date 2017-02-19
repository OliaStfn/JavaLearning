package lesson01.homework;

import java.util.Scanner;

public class Task1003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, y;
        System.out.println("Enter x: ");
        x = in.nextDouble();

        y = (Math.log10(x) / Math.log10(2)) - (Math.log10(x) / Math.log10(3)) + Math.pow(x, (Math.log10(8) / Math.log10(3)));
        System.out.println("y= " + y);
    }
}

