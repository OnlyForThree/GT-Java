/**
*Name: Alex Nguyen
*Date: 07/15/22
*Program Name: Necklace.java
*Purpose: A program that runs through the "necklace problem." This problem begins with two Strings that represent single-digit numbers. The next number is obtained by adding the first two numbers together and saving only the ones digit. This process is repeated until the “necklace” closes by returning to the original two numbers.
*/

import java.util.Scanner; //Import Scanner
import java.lang.String; //Import String methods

public class Necklace {
  public static void main(String[] args) {
    String inputOneAN, inputTwoAN, calculateOneAN, calculateTwoAN;
    String newNumberAN, secondToLastAN;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first one-digit number: ");
    inputOneAN = input.next();
    calculateOneAN = inputOneAN;
    
    System.out.print("Enter the second one-digit number: ");
    inputTwoAN = input.next();
    calculateTwoAN = inputTwoAN;

    System.out.print("\n" + inputOneAN + " " + inputTwoAN);

    do{
    if (Integer.parseInt(calculateOneAN) + Integer.parseInt(calculateTwoAN) >= 10){
      newNumberAN = Integer.toString(Integer.parseInt(calculateOneAN) + Integer.parseInt(calculateTwoAN) -10);
    }
    else{
      newNumberAN = Integer.toString(Integer.parseInt(calculateOneAN) + Integer.parseInt(calculateTwoAN));
    }

    System.out.print(" " + newNumberAN);
      
    calculateOneAN = calculateTwoAN;
    calculateTwoAN = newNumberAN;

    } while(! ((calculateOneAN.equals(inputOneAN)) && (calculateTwoAN.equals(inputTwoAN))));
  }
}