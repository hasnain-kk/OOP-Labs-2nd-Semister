/*
 * Assignment : Assignment 9
 * Name : Hasnain KK
 */

import java.util.Scanner;

public class Lab03T09 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int n = input.nextInt();
    System.out.println("Multiplication Table of " + n);
    for (int i = 1; i <= 10; i++) {
      System.out.println(i + " x " + n + "=" + i * n);
    }
    input.close();
  }
}
