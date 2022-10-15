/*
 * Assignment : Assignment 3
 * Name : Hasnain KK
 */

import java.util.Scanner;

public class Lab03T03 {

  public static void main(String[] args) {
    int a, b, c;
    String d;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Sign of Operation e.g: +, -, * : ");
    d = input.next();
    if (d.equals("+")) {
      System.out.println("You want to Perform Addition");
      System.out.print("Enter a : ");
      a = input.nextInt();
      System.out.print("Enter b : ");
      b = input.nextInt();
      c = a + b;
      System.out.print("a+b = " + c);
      long factorial = 1;
      int i = 1;
      do {
        factorial = factorial * i;
        i++;
      } while (i <= c);
      System.out.println("factorial of " + c + " is " + factorial);
    } else if (d.equals("-")) {
      System.out.println("You want to Perform Subtraction");
      System.out.print("Enter a : ");
      a = input.nextInt();
      System.out.print("Enter b : ");
      b = input.nextInt();
      c = a - b;
      System.out.println("a-b = " + c);
      long factorial = 1;
      int i = 1;
      do {
        factorial = factorial * i;
        i++;
      } while (i <= c);
      System.out.println("\n factorial of " + c + " is " + factorial);
    } else if (d.equals("*")) {
      System.out.println("You want to Perform Multiplication");
      System.out.print("Enter a : ");
      a = input.nextInt();
      System.out.print("Enter b : ");
      b = input.nextInt();
      c = a * b;
      System.out.println("a*b = " + c);
      long factorial = 1;
      int i = 1;
      do {
        factorial = factorial * i;
        i++;
      } while (i <= c);
      System.out.println("factorial of " + c + " is " + factorial);
    } else System.out.println("Try Again");
    input.close();
  }
}
