package lesson02.classwork;


import java.util.Scanner;

/*
Дано дійсні числа x,y.
Якщо x i y від’ємні, то кожне значення  замінити його модулем.
Якщо  від’ємне тільки одне число, то обидва значення збільшити на 0,5.
Якщо два значення додатні і ні одне із них не належить відрізку [0.5,2.0], то обидва значення зменшити в 10 раз.
В інших випадках x та y залишити без змін. Вивести отриманий результат.
 */
public class lesson2_1 {
    public static void main(String[] args) {
        double x, y;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x: ");
        x = in.nextDouble();
        System.out.print("Enter y: ");
        y = in.nextDouble();

        if (x < 0 && y < 0) {
            System.out.println("Умова 1:");
            x = Math.abs(x);
            y = Math.abs(y);

        } else if (x < 0 || y < 0) {
            System.out.println("Умова 2:");
            x *= 0.5;
            y *= 0.5;
        } else if (x > 0 && y > 0) {
            if ((x < 0.5 && y < 0.5) || (x > 2 && y > 2)) {
                System.out.println("Умова 3:");
                x /= 10;
                y /= 10;
            }
        } else {
            System.out.println("Умова 4:");
        }
        System.out.println("x: " + x + " y: " + y);
    }
}
