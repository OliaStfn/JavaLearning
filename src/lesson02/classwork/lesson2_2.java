package lesson02.classwork;


import java.util.Random;
import java.util.Scanner;

public class lesson2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random numbers = new Random();
        int size, choise;

        do {
            System.out.print("1 - Generate array: ");
            System.out.print("0 - Exit: ");
            choise = in.nextInt();

            switch (choise) {
                case 1:
                    System.out.print("Enter array size: ");
                    size = in.nextInt();
                    double[] testArray = new double[size];
                    for (int i = 0; i < testArray.length; i++) {
                        testArray[i] = numbers.nextInt(10) + numbers.nextDouble();
                    }
                    System.out.println("");
                    for (double element : testArray) {
                        System.out.print(element + " ");
                    }
                    break;
                case 0:
                    break;
            }
        } while (choise!=0);

    }
}
