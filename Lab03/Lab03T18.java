/*
 * Assignment : Assignment 18
 * Name : Hasnain KK
 */

import java.util.Scanner;

public class Lab03T18 {

  public static void main(String[] args) {
    int x, y, gcd = 1;
    System.out.print("Enter first number : ");
    Scanner input = new Scanner(System.in);
    x = input.nextByte();
    System.out.print("Enter Second number : ");
    y = input.nextByte();
    for (int i = 1; i <= x && i <= y; i++) {
      if (x % i == 0 && y % i == 0) gcd = i;
    }
    System.out.printf("GCD of %d and %d is: %d", x, y, gcd);
    input.close();
  }
}
