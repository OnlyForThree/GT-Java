/**
*Name: Alex Nguyen
*Date: 07/13/22
*Project Name: CubesSum.java
*Purpose: A CubesSum application that prompts the user for a non-negative integer up to four digits long
*(i.e. max value would be 9999)
*and then displays the sum of the cubes of the digits
*/

import java.util.Scanner; // Import the Scanner
import java.text.NumberFormat; //Import the Nmber Format
import java.lang.Math; //Import math functions

public class CubesSum{
  public static void main(String[] args){
    //Declare variables
    int numberInputAN;
    int thousandsAN;
    int hundredsAN;
    int tensAN;
    int onesAN;
    
    Scanner input = new Scanner(System.in);
    NumberFormat number = NumberFormat.getIntegerInstance();
    
    do{ //Ask for positive integer
    System.out.print("Enter a positive integer: ");
    numberInputAN = input.nextInt();
     if (numberInputAN < 1){ //If integer is not positive then ask again
       System.out.println("The number you entered is not a positive integer. Please try again.\n");
     }
    } while (numberInputAN < 1);

    //Total all difits
    thousandsAN = numberInputAN / 1000;
    numberInputAN = numberInputAN - (thousandsAN * 1000);
    
    hundredsAN = numberInputAN / 100;
    numberInputAN = numberInputAN - (hundredsAN * 100);

    tensAN = numberInputAN / 10;
    numberInputAN = numberInputAN - (tensAN * 10);

    onesAN = numberInputAN / 1;
    numberInputAN = numberInputAN - (onesAN * 1);

    //Display total after adding the cubes
    System.out.println("The sum of the cubes of the digits is: " + number.format(Math.pow(hundredsAN, 3) + Math.pow(tensAN, 3) + Math.pow(onesAN, 3)));

  }
}