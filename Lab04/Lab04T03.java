/*
 * Arrignment : Assignment 3
 * Name : Hasnain KK
 */

public class Lab04T03 {

  public static void main(String[] args) {
    String name = " Muhammad Hasnain";
    String Roll = "K-21SW001";
    int total = 600;
    int oop = 87, oopP = 90, laag = 90, ps = 45, ise = 87, pp = 80, isl = 45;
    System.out.println(name);
    System.out.println(Roll);
    System.out.println("Marks Obtained in Subjects");
    System.out.println("OOP            : " + oop);
    System.out.println("OOP Practical  : " + oopP);
    System.out.println("LAAG           : " + laag);
    System.out.println("Pakistan Study : " + ps);
    System.out.println("ISE            : " + ise);
    System.out.println("PP             : " + pp);
    System.out.println("Islamiyat      : " + isl);
    int Obtained = oop + oopP + laag + pp + ps + ise + isl;
    System.out.println("Marks Obtained : " + Obtained + "/" + total);
    double Percentage = (Obtained * 100) / total;
    System.out.println("Percentage     : " + Percentage);
    if (Percentage < 50) {
      System.out.println("CGPA        : Fail");
    }
    if (Percentage < 60 && Percentage >= 50) {
      System.out.println("CGPA      : C+");
    }
    if (Percentage < 70 && Percentage >= 60) {
      System.out.println("CGPA      : B");
    }
    if (Percentage < 80 && Percentage >= 70) {
      System.out.println("CGPA      : B+");
    }
    if (Percentage < 90 && Percentage >= 80) {
      System.out.println("CGPA      : A");
    }
    if (Percentage <= 100 && Percentage >= 90) {
      System.out.println("CGPA      : A+");
    }
  }
}
