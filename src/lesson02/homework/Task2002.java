package lesson02.homework;

import java.util.Random;
import java.util.Scanner;

public class Task2002 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random num = new Random();

        int[] student = new int[22];
        int r, count = 0;
        System.out.print("Enter height: ");
        r = in.nextInt();
        for (int element : student) {
            element = num.nextInt(50) + 160;
            if (element < r) {
                count++;
            }
        }
        System.out.println("Count of students are less "+r+ " : "+count);
    }
}
