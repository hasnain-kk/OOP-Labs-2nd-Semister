/*
 * Assignment : Assignment 11
 * Name : Hasnain KK
 */

import java.util.Scanner;

public class Lab03T11 {

  public static void main(String[] args) {
    int prime_sum = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("enter the ten prime numbers :");
    for (int i = 1; i <= 10; i++) {
      System.out.print("enter prime number " + i + " : ");
      int k = input.nextInt();
      prime_sum += k;
    }
    System.out.println("prime sum = " + prime_sum);
    input.close();
  }
}
