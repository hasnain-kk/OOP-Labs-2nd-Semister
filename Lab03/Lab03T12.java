/*
 * Assignment : Assignment 12
 * Name : Hasnain KK
 */

import java.util.Scanner;

public class Lab03T12 {

  public static void main(String[] args) {
    int positive = 0, negative = 0, zero = 0;
    System.out.println("Enter any 10 numbers : ");
    Scanner input = new Scanner(System.in);
    for (int i = 1; i <= 10; i++) {
      int a = input.nextInt();
      if (a > 0) {
        positive++;
      }
      if (a < 0) {
        negative++;
      }
      if (a == 0) {
        zero++;
      }
    }
    System.out.println("Positive Count : " + positive);
    System.out.println("Negative Count : " + negative);
    System.out.println("Zeros Count    : " + zero);
    input.close();
  }
}
