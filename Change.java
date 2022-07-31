/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/28/22
 * Filename: Change.java
 * Purpose:  a Change application that prompts the user for an amount of change in cents and then displays the minimum number of coins necessary to make the change (i.e. start with determining how many quarters, then dimes, etc.).  The change can be made of quarters, dimes, nickels, and pennies.
 */

import java.util.Scanner; // Import the Scanner
import java.text.NumberFormat; //Import the Nmber Format

public class Change{
  public static void main(String[] args){
    //Declare variables
    int centsAN;
    int quartersAN;
    int dimesAN;
    int nickelsAN;
    int penniesAN;
    
    Scanner input = new Scanner(System.in);
    NumberFormat number = NumberFormat.getIntegerInstance();
    
    //Total all steps
    System.out.print("Enter the change in cents: ");
    centsAN = input.nextInt();

    quartersAN = centsAN / 25;
    centsAN = centsAN - (quartersAN * 25);

    dimesAN = centsAN / 10;
    centsAN = centsAN - (dimesAN * 10);

    nickelsAN = centsAN / 5;
    centsAN = centsAN - (nickelsAN * 5);

    penniesAN = centsAN / 1;
    centsAN = centsAN - (penniesAN * 1);

    //Display total + averages
    System.out.println("The minimum number of coins is: ");
    System.out.println("\t Quarters: " + number.format(quartersAN));
    System.out.println("\t Dimes: " + number.format(dimesAN));
    System.out.println("\t Nickels: " + number.format(nickelsAN));
    System.out.println("\t Pennies: " + number.format(penniesAN));
  }
}