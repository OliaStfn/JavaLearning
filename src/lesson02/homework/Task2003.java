package lesson02.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random num = new Random();

        int[] student = new int[30];
        int[] schoolboy = {1, 4, 5, 7};

        int[] command;

        command = student;


        int count = 0;
        for (int element : student) {
            element = num.nextInt(20) + 160;
            if (element > 170) {
                count++;
            }
        }
        if (count < 5) {
            System.out.println("Count is: " + count + " student, because the team won`t be formed.");
        } else System.out.println("Count is: " + count + " student, because the team will be formed.");
    }
}