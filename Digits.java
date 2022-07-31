/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/28/22
 * Filename: Digits.java
 * Purpose: A Digits application that will show the hundreds-place, tens-place, and ones-place. 
 */

import java.util.Scanner; // Import the Scanner
import java.text.NumberFormat; //Import the Nmber Format

public class Digits{
  public static void main(String[] args){
    //Declare variables
    int numberInputAN;
    int hundredsAN;
    int tensAN;
    int onesAN;
    
    Scanner input = new Scanner(System.in);
    NumberFormat number = NumberFormat.getIntegerInstance();
    
    //Total all steps
    System.out.print("Enter a three-digit number: ");
    numberInputAN = input.nextInt();

    hundredsAN = numberInputAN / 100;
    numberInputAN = numberInputAN - (hundredsAN * 100);

    tensAN = numberInputAN / 10;
    numberInputAN = numberInputAN - (tensAN * 10);

    onesAN = numberInputAN / 1;
    numberInputAN = numberInputAN - (onesAN * 1);

    //Display total + averages
    System.out.println("The hundreds-place digit is: " + number.format(hundredsAN));
    System.out.println("The tens-place digit is: " + number.format(tensAN));
    System.out.println("The ones-place digit is: " + number.format(onesAN));
  }
}