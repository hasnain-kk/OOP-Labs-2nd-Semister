/*
 * Arrignment : Assignment 2.2
 * Name : Hasnain KK
 */

import java.util.Scanner;

public class Lab04T02_2 {

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
    if (choice == 1) {
      System.out.println("Addition");
      System.out.print("Enter a = ");
      a = input.nextInt();
      System.out.print("Enter b = ");
      b = input.nextInt();
      c = a + b;
      System.out.println("a + b = " + c);
    } else if (choice == 2) {
      System.out.println("Multiplication");
      System.out.print("Enter a = ");
      a = input.nextInt();
      System.out.print("Enter b = ");
      b = input.nextInt();
      c = a * b;
      System.out.println("a x b = " + c);
    } else if (choice == 3) {
      System.out.println("Subtraction");
      System.out.print("Enter a = ");
      a = input.nextInt();
      System.out.print("Enter b = ");
      b = input.nextInt();
      c = a - b;
      System.out.println("a - b = " + c);
    } else if (choice == 4) {
      System.out.println("Division");
      System.out.print("Enter a = ");
      a = input.nextInt();
      System.out.print("Enter b = ");
      b = input.nextInt();
      c = a / b;
      System.out.println("a / b = " + c);
    } else System.out.println("Wrong Input");
    input.close();
  }
}
