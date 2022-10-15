/*
 * Assignment : Assignment 19
 * Name : Hasnain KK
 */

public class Lab03T19 {

  public static void main(String[] args) {
    double a = 38500;
    double i;
    int n = 21;
    while (true) {
      i = a * 0.07;
      a += i;
      n++;
      if (a >= 77000) {
        break;
      }
    }
    System.out.println("fees will be double in this year 20" + n);
  }
}
