/**
 * 
 * Designer: Alex Nguyen
 * Date: 7/5/22
 * Filename: MyPow.java
 * Purpose:  A MyPow application that prompts the user for two numbers and then displays the result from the formula and, for comparison, show the same result using the Math pow() method.
 */
import java.util.Scanner;
import java.lang.Math;

class MyPow {
  public static void main(String[] args) {
    int xAN, yAN;
    double formulaResultAN, mathResultAN;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a value for X: ");
    xAN = input.nextInt();

    System.out.print("Enter a value for Y: ");
    yAN = input.nextInt();

    formulaResultAN = Math.exp(yAN * Math.log(xAN));
    mathResultAN = Math.pow(xAN, yAN);
    
    System.out.println("\nThe result from using the formula is: " + formulaResultAN);

    System.out.println("\nThe result from using the Math pow<> method is: " + mathResultAN);
  }
}