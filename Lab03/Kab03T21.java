/*
 * Assignment : Assignment 21
 * Name : Hasnain KK
 */

import java.util.Scanner;

public class Kab03T21 {

  public static void main(String[] args) {
    double sum = 0;
    System.out.println("Enter value of n: ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    input.close();
    double k;
    for (k = 1; k <= n; k++) {
      sum += Math.sqrt(k);
    }

    System.out.println(sum);
  }
}
