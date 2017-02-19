package lesson01.homework;

import java.util.Scanner;

public class Task1002 {
    public static void main(String[] args) {
        double a, x;
        final double p = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x: ");
        x = in.nextDouble();

        a = (2 * Math.cos(x - (p / 6))) / (x + (Math.sin(x) * Math.sin(x)));
        System.out.println("a=" + a);
    }
}