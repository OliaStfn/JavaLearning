package lesson02.homework;

import java.util.Random;
import java.util.Scanner;

public class Task2001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random num = new Random();

        int size, sum = 0;
        System.out.print("Enter array size: ");
        size = in.nextInt();
        int[] Array = new int[size];
        for (int element : Array) {
            element = num.nextInt(30);
            sum += (element > 20) ? element : 0;//if(element>20) {sum+=element;}
        }
        System.out.println("Sum elements: " + sum);
        if (sum > 100) {
            System.out.println("Sum elements more as 100");
        } else System.out.println("Sum elements less as 100");

    }
}
