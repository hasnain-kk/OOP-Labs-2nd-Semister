/*
 * Assignment : Assignment 13
 * Name : Hasnain KK
 */

import java.util.Scanner;

public class Lab03T13 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int min = 5, max = 150;
    for (int i = 1; i <= 1000; i++) {
      int ran = (int) Math.floor(Math.random() * (max - min + 1) + min);
      System.out.print(
        "enter the number inorder to match with the random number : "
      );
      int num = input.nextInt();
      if (ran == num) {
        System.out.println("the entered number and random number is matched");
        break;
      } else if (num < 5) {
        System.out.println("too short number kindly try again");
      } else if (num > 150) {
        System.out.println("too long number kindly try again");
      } else {
        System.out.println("mismatched! try again");
      }
      input.close();
    }
  }
}
