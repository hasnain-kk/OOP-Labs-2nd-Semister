/*
 * Assignment : Assignment 6.5
 * Name : Hasnain KK
 */

public class Lab03T06_5 {

  public static void main(String[] args) {
    int space;
    for (int i = 1, k = 0; i <= 5; ++i, k = 0) {
      for (space = 1; space <= 5 - i; ++space) {
        System.out.print("  ");
      }
      while (k != 2 * i - 1) {
        System.out.print(" " + i);
        ++k;
      }
      System.out.println();
    }
  }
}
