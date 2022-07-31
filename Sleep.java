
/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/29/22
 * Filename: Sleep.java
 * Purpose: a Sleep application that calculates the number of hours of your life that you have spent sleeping.  Assume that you sleep 8 hours each night. (Simplified: 30 days in each month and 365 days in each year)
 */

import java.util.Scanner; // Import the Scanner
import java.text.NumberFormat; // Import Number Format

public class Sleep {
  public static void main(String[] args) {
    // Declare variables
    int birthYearAN = 0;
    int birthMonthAN = 0;
    int birthDayAN = 0;
    int currentYearAN = 0;
    int currentMonthAN = 0;
    int currentDayAN = 0;
    int dayDifferenceAN = 0;

    Scanner input = new Scanner(System.in);
    NumberFormat number = NumberFormat.getIntegerInstance();

    // Recieve inputs for "birth" variables
    System.out.println("Enter your birthdate:");
    System.out.print("Year: ");
    birthYearAN = input.nextInt();
    System.out.print("Month: ");
    birthMonthAN = input.nextInt();
    System.out.print("Day: ");
    birthDayAN = input.nextInt();

    //Recieve inputs for "current" variables
    System.out.println("\n\nEnter today's date:");
    System.out.print("Year: ");
    currentYearAN = input.nextInt();
    System.out.print("Month: ");
    currentMonthAN = input.nextInt();
    System.out.print("Day: ");
    currentDayAN = input.nextInt();

    // Caluclate for dayDifferenceAN
    dayDifferenceAN = ((currentYearAN * 365) + (currentMonthAN * 30) + currentDayAN)
        - ((birthYearAN * 365) + (birthMonthAN * 30) + birthDayAN);

    // Display totals
    System.out.println("\nYou have been alive for " + number.format(dayDifferenceAN) + " days.");
    System.out.println("You have slept " + number.format(dayDifferenceAN * 8) + " hours.");
  }
}