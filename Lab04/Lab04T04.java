/*
 * Arrignment : Assignment 4
 * Name : Hasnain KK
 */

import java.util.Scanner;

public class Lab04T04 {

  public static void main(String[] args) {
    long factorial = 1;
    int i = 1;
    int a, b;
    System.out.print("Enter The Number one : ");
    Scanner input = new Scanner(System.in);
    a = input.nextInt();
    System.out.print("Enter the number two : ");
    b = input.nextInt();
    do {
      factorial = factorial * i;
      i++;
    } while (i <= a);
    System.out.println("factorial of " + a + " is " + factorial);
    System.out.println(a + "+" + b + "=" + (a + b));
    System.out.println(a + "x" + b + "=" + (a * b));
    System.out.println(a + "-" + b + "=" + (a - b));
    input.close();
  }
}
