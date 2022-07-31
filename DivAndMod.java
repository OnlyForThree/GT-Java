/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/28/22
 * Filename: DivAndMod.java
 * Purpose:  A DivAndMod application that prompts the user for two integers and then displays the result of integer and modulus division. 
 */

import java.util.Scanner; // Import the Scanner
import java.text.NumberFormat; //Import the Nmber Format

public class DivAndMod{
  public static void main(String[] args){
    //Declare variables
    int numberInputOneAN;
    int numberInputTwoAN;
    
    Scanner input = new Scanner(System.in);
    NumberFormat number = NumberFormat.getIntegerInstance();
    
    //Total all steps
    System.out.print("Enter an integer: ");
    numberInputOneAN = input.nextInt();

    System.out.print("Enter a second integer: ");
    numberInputTwoAN = input.nextInt();

    //Display results
    System.out.println("");
    System.out.println(numberInputOneAN + " / " + numberInputTwoAN + " = " + (numberInputOneAN / numberInputTwoAN));
    System.out.println(numberInputOneAN + " % " + numberInputTwoAN + " = " + (numberInputOneAN % numberInputTwoAN));
    System.out.println("");
    System.out.println(numberInputTwoAN + " / " + numberInputOneAN + " = " + (numberInputTwoAN / numberInputOneAN));
    System.out.println(numberInputTwoAN + " % " + numberInputOneAN + " = " + (numberInputTwoAN % numberInputOneAN));
  }
}