/**
 * 
 * Designer: Alex Nguyen
 * Date: 07/12/22
 * Filename: DigitsSum.java
 * Purpose:  A DigitsSum application that prompts the user for a non-negative integer and then displays the sum of the digits. 
 */

import java.util.Scanner; // Import the Scanner
import java.text.NumberFormat; //Import the Nmber Format

public class DigitsSum{
  public static void main(String[] args){
    //Declare variables
    int numberInputAN;
    int hundredsAN;
    int tensAN;
    int onesAN;
    
    Scanner input = new Scanner(System.in);
    NumberFormat number = NumberFormat.getIntegerInstance();
    
    do{
    System.out.print("Enter a positive integer: ");
    numberInputAN = input.nextInt();
     if (numberInputAN < 1){
       System.out.println("The number you entered is not a positive integer. Please try again.\n");
     }
    } while (numberInputAN < 1);

    //Total all steps
    hundredsAN = numberInputAN / 100;
    numberInputAN = numberInputAN - (hundredsAN * 100);

    tensAN = numberInputAN / 10;
    numberInputAN = numberInputAN - (tensAN * 10);

    onesAN = numberInputAN / 1;
    numberInputAN = numberInputAN - (onesAN * 1);

    //Display total + averages
    System.out.println("The sum of the digits is: " + number.format(hundredsAN + tensAN + onesAN));

  }
}