/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/28/22
 * Filename: TimeConversion.java
 * Purpose: A TimeConversion application that prompts the user for a time in minutes and then displays the time in hours and minutes.
 */

import java.util.Scanner; // Import the Scanner
import java.text.NumberFormat; //Import the Nmber Format

public class TimeConversion{
  public static void main(String[] args){
    //Declare variables
    int minutesInputAN;
    int hoursAN;
    int minutesAN;
    
    Scanner input = new Scanner(System.in);
    NumberFormat number = NumberFormat.getIntegerInstance();
    
    //Total all steps
    System.out.print("Enter the time in minutes: ");
    minutesInputAN = input.nextInt();

    hoursAN = minutesInputAN / 60;
    minutesInputAN = minutesInputAN - (hoursAN * 60);

    minutesAN = minutesInputAN / 1;
    minutesInputAN = minutesInputAN - (minutesAN * 1);

    //Display total + averages
    System.out.println("The time is: " + hoursAN + ":" + minutesAN);
  }
}