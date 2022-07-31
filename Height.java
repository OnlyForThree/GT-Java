/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/27/22
 * Filename: Height.java
 * Purpose:  A Height application that prompts the user for a person's height in inches and coverts the input to feet and inches 
 */

import java.util.Scanner; // Import the Scanner class
import java.text.NumberFormat; //Import Number Format

public class Height{
  public static void main(String[] args){
    //Declare variable
    int inchesAN = 0;
    
    Scanner input = new Scanner(System.in);
    NumberFormat number = NumberFormat.getIntegerInstance();
    
    //Take user input for inchesAN
    System.out.print("Enter your height in inches: ");
    inchesAN += input.nextDouble();

    //Display height in feet + inches
    System.out.println("You are " + ((inchesAN - (inchesAN % 12)) /12)  + " feet and " + (inchesAN % 12) + " inches tall");
  }
}