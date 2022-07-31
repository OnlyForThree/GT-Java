/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/30/22
 * Filename: EvenOdd.java
 * Purpose:  A Java program to get a number from the user and print whether it is even or odd.
 */
import java.util.Scanner;

public class EvenOdd {
  public static void main(String[] args) {

    //Declare variables
    int inputAN;
    
    Scanner input = new Scanner(System.in);

    //Take number input
    System.out.print("Enter an integer: ");
    inputAN = input.nextInt();

    //Checl even or odd and display result
    if ((inputAN % 2) == 0)
    {
      System.out.println("Number is even");
    }
    else 
    {
      System.out.println("Number is odd");
    }
  }
}