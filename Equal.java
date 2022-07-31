/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/30/22
 * Filename: Equal.java
 * Purpose:  A Java program that accepts two integer numbers and checks whether they are the same.
 */
import java.util.Scanner;

public class Equal{
  public static void main(String[] args){

    //Declare variables
    int inputOneAN, inputTwoAN;

    Scanner input = new Scanner(System.in);

    //Take input for variables
    System.out.print("Input first integer: ");
    inputOneAN = input.nextInt();

    System.out.print("Input second integer: ");
    inputTwoAN = input.nextInt();

    //Check for even/odd and display result
    if (inputOneAN == inputTwoAN)
    {
      System.out.println("These numbers are equal.");
    }
    else{
      System.out.println("These numbers are different.");
    }
  }
}