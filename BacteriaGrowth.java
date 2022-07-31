/**
 * 
 * Designer: Alex Nguyen
 * Date: 7/5/22
 * Filename: BacteriaGrowth.java
 * Purpose:  A BacteriaGrowth application that calculates a the number of bacteria after prompting the user for the initial amount (n), the constant (k) and the number of hours (t).
 */
import java.util.Scanner;
import java.lang.Math;

class BacteriaGrowth {
  public static void main(String[] args) {
    int initialBacteriaAN, hoursAN;
    double constantAN, finalAmountAN;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the initial bacteria amount: ");
    initialBacteriaAN = input.nextInt();

    System.out.print("Enter a constant value for k: ");
    constantAN = input.nextDouble();

    System.out.print("Enter the growth time period in hours: ");
    hoursAN = input.nextInt();

    finalAmountAN = initialBacteriaAN * (Math.exp(constantAN * hoursAN));

    System.out.println(finalAmountAN + " bacteria will be present after " + hoursAN + " hours.");
  }
}