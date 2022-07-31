/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/30/22
 * Filename: Greatest.java
 * Purpose:  Take three numbers from the user and print the greatest number.
 */

import java.util.Scanner; //Import scanner class

public class Greatest{
  public static void main(String[] args){
  //Declare variables
    int inputOneAN;
    int inputTwoAN;
    int inputThreeAN;

    Scanner input = new Scanner(System.in);

    //Take number inputs
    System.out.print("Input the 1st number: ");
    inputOneAN = input.nextInt();

    System.out.print("Input the 2nd number: ");
    inputTwoAN = input.nextInt();

    System.out.print("Input the 3rd number: ");
    inputThreeAN = input.nextInt();

    //Find the greatest value and display
    if ((inputOneAN >= inputTwoAN) & (inputOneAN >= inputThreeAN))
    {
          System.out.println("\nThe greatest: " + inputOneAN);
    }
    else if ((inputTwoAN >= inputOneAN) & (inputTwoAN >= inputThreeAN))
    {
          System.out.println("\nThe greatest: " + inputTwoAN);
    }
    else if ((inputThreeAN >= inputOneAN) & (inputThreeAN >= inputTwoAN))
    {
          System.out.println("\nThe greatest: " + inputThreeAN);
    }
  }
}