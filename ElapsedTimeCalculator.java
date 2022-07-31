/**
*Name: Alex Nguyen
*Date: 07/20/22
*Program Name: ElapsedTimeCalculator.java
*Purpose: An ElapsedTimeCalculator application that prompts the user for the starting time, time of day, and number of elapsed hours
The program then displays the calculated time accordingly
*/

import java.util.Scanner;
import java.lang.String;

public class ElapsedTimeCalculator {
  public static void main(String[] args) {
    int startingHourAN = 0, elapsedHoursAN, calculateTimeAN = 0;
    String timeOfDayAN = "";

    Scanner input = new Scanner(System.in);

    do{
    System.out.print("Enter the starting hour: ");
    startingHourAN = input.nextInt();
    } while ((startingHourAN  < 1) && (startingHourAN > 12));

    do{
    System.out.print("\nEnter am or pm: ");
    timeOfDayAN = input.next();
    } while (! ((timeOfDayAN.equals("am")) || (timeOfDayAN.equals("pm"))));
      
    System.out.print("\nEnter the number of elapsed hours: ");
    elapsedHoursAN = input.nextInt();

    if (timeOfDayAN.equals("am")){
      calculateTimeAN = startingHourAN + elapsedHoursAN;
    }
    else if (timeOfDayAN.equals("pm")){
      calculateTimeAN = startingHourAN + 12 + elapsedHoursAN;
    }

    if (calculateTimeAN > 24){
      calculateTimeAN = calculateTimeAN - 24;
      timeOfDayAN = "am";
    }
    else if (calculateTimeAN > 12){
      calculateTimeAN = calculateTimeAN - 12;
      timeOfDayAN = "pm";
    }

    if ((calculateTimeAN == 12) && (timeOfDayAN.equals("am"))){
      System.out.println("\nThe time is: 12:00 am - NOON");
    }
    else if ((calculateTimeAN == 12) && (timeOfDayAN.equals("pm"))){
      System.out.println("\nThe time is: 12:00 pm - MIDNIGHT");
    }
    else{
      System.out.println("\nThe time is: " + calculateTimeAN + ":00 " + timeOfDayAN);
    }
  }
}