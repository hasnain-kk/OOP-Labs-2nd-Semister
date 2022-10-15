/*
 * Arrignment : Assignment 5
 * Name : Hasnain KK
 */

import java.util.Scanner;

public class Lab04T05 {
    public static void main(String[] args) {
        System.out.println("Enter 3 Values: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a<b && b<c){
            System.out.println(c+" is Greater Number");
        }   else if (a<b && c<b){
            System.out.println(b+" is Greater Number");
        }   else if (a>b && a>c){
            System.out.println(a+" is Greater Number");
        }   else
            System.out.println("Numbers are Equal");

            input.close();
    }
}
