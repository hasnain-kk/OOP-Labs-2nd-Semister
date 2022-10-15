/*
 * Assignment : Assignment 15
 * Name : Hasnain KK
 */

import java.util.Scanner;

public class Lab03T15 {

  public static void main(String[] args) {
    int sum;
    int a;
    for (int i = 0; i <= 100; i++) {
      System.out.print(
        "Enter an int Value (The Program exists if the input is 0) : "
      );
      Scanner input = new Scanner(System.in);
      a = input.nextInt();
      if (a == 0) {
        a++;
        sum = 0;
        sum = sum + a;
        System.out.println("The Sum is " + a);
        break;
      }
      input.close();
    }
  }
}
