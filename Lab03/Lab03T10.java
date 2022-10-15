/*
 * Assignment : Assignment 10
 * Name : Hasnain KK
 */

import java.util.Scanner;

public class Lab03T10 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int c = input.nextInt();
    long factorial = 1;
    int i = 1;
    do {
      factorial = factorial * i;
      i++;
    } while (i <= c);
    System.out.println("factorial of " + c + " is " + factorial);
    input.close();
  }
}
