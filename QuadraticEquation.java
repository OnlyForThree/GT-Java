/**
 * 
 * Designer: Alex Nguyen
 * Date: 7/5/22
 * Filename: QuadraticEquations.java
 * Purpose:  A QuadraticEquation application that gives the solution to any quadratic equation. The application should prompt the user for values for a, b, and c and then display the roots, if any.  
 */
import java.lang.Math;
import java.util.Scanner;

public class QuadraticEquation {
  public static void main(String[] args) {
    int aAN, bAN, cAN;
    double resultOneAN, resultTwoAN;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the value for a: ");
    aAN = input.nextInt();

    System.out.print("Enter the value for b: ");
    bAN = input.nextInt();

    System.out.print("Enter the value for c: ");
    cAN = input.nextInt();

    if (((aAN == 0) || (bAN == 0)) || (cAN == 0)){
      System.out.println("The quadratic equation cannot be solved");
    }
    else{
    resultOneAN = ((-1 * bAN) + Math.sqrt((Math.pow(bAN, 2)) - (4 * aAN * cAN))) / (2 * aAN);
    resultTwoAN = ((-1 * bAN) - Math.sqrt((Math.pow(bAN, 2)) - (4 * aAN * cAN))) / (2 * aAN);

    System.out.println("The roots are " + resultOneAN + " and " + resultTwoAN);
    }
  }
}