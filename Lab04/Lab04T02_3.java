/*
 * Arrignment : Assignment 2.3
 * Name : Hasnain KK
 */

import java.util.Scanner;

public class Lab04T02_3 {
    public static void main(String[] args) {
        int a, b, c, choice;
        System.out.println("Calculator Menu");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Subtraction");
        System.out.println("4. Division");
        System.out.print("Enter Your Choice : ");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Addition");
                System.out.print("Enter a = ");
                a = input.nextInt();
                System.out.print("Enter b = ");
                b = input.nextInt();
                c = a + b;
                System.out.println("a + b = " + c);
            }
            case 2 -> {
                System.out.println("Multiplication");
                System.out.print("Enter a = ");
                a = input.nextInt();
                System.out.print("Enter b = ");
                b = input.nextInt();
                c = a * b;
                System.out.println("a x b = " + c);
            }
            case 3 -> {
                System.out.println("Subtraction");
                System.out.print("Enter a = ");
                a = input.nextInt();
                System.out.print("Enter b = ");
                b = input.nextInt();
                c = a - b;
                System.out.println("a - b = " + c);
            }
            case 4 -> {
                System.out.println("Division");
                System.out.print("Enter a = ");
                a = input.nextInt();
                System.out.print("Enter b = ");
                b = input.nextInt();
                c = a / b;
                System.out.println("a / b = " + c);
            }
            default -> System.out.println("Wrong Input");

        }
        input.close();
    }
    
}
