/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/27/22
 * Filename: Days.java
 * Purpose: An application that prompts the user for a number of Days. Then, the computer computes and prints out the following:
-number of weeks
-number of hours
-number of minutes
-number of seconds
 */

import java.util.Scanner; // Import the Scanner
import java.text.NumberFormat; //Import the Nmber Format

public class Days{
  public static void main(String[] args){
    //Declare variable
    double daysAN = 0;
    double hoursAN = 0;
    double minutesAN = 0;
    double secondsAN = 0;
    
    Scanner input = new Scanner(System.in);
    NumberFormat number = NumberFormat.getIntegerInstance();
    
    //Total all steps
    System.out.print("Enter number of days: ");
    daysAN = input.nextDouble();

    //Caluclate other total + averages
    hoursAN = daysAN * 24;
    minutesAN = hoursAN * 60;
    secondsAN = minutesAN * 60;
    
    //Display total + averages
    System.out.println("Total number of weeks: " + number.format((daysAN - (daysAN % 7)) /7) + " week and " + number.format(daysAN % 7) + " days");
    System.out.println("Number of hours: " + number.format(hoursAN));
    System.out.println("Number of minutes: " + number.format(minutesAN));
    System.out.println("Number of Seconds: " + number.format(secondsAN));
  }
}