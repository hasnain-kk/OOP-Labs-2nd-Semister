/*
 * Assignment : Assignment 8
 * Name : Hasnain KK
 */

import java.util.Random;
import java.util.Scanner;

public class Lab03T08 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b, c, f = 6;
    do {
      System.out.println("Calculator Menu");
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.println("5. Generate Random Number");
      System.out.println("6. Exit");
      System.out.print("Enter Your Menu Choice : ");
      int d = input.nextInt();
      if (d == 1) {
        System.out.print("Enter Value of a = ");
        a = input.nextInt();
        System.out.print("Enter value of b = ");
        b = input.nextInt();
        c = a + b;
        System.out.println("a+b = " + c);
      } else if (d == 2) {
        System.out.print("Enter Value of a = ");
        a = input.nextInt();
        System.out.print("Enter value of b = ");
        b = input.nextInt();
        c = a - b;
        System.out.println("a-b = " + c);
      } else if (d == 3) {
        System.out.print("Enter Value of a = ");
        a = input.nextInt();
        System.out.print("Enter value of b = ");
        b = input.nextInt();
        c = a * b;
        System.out.println("a*b = " + c);
      } else if (d == 4) {
        System.out.print("Enter Value of a = ");
        a = input.nextInt();
        System.out.print("Enter value of b = ");
        b = input.nextInt();
        c = a / b;
        System.out.println("a/b = " + c);
      } else if (d == 5) {
        new Random();
        System.out.println("1st Random Number: " + Math.random());
      } else if (d == 6) {
        System.out.println("Program exit");
        break;
      } else System.out.println("You Entered Wrong");
    } while (f <= 6);
    input.close();
  }
}
