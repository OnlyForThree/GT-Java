/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/30/22
 * Filename: Weekday.java
 * Purpose:  A Java program that takes a number from the user between 1 and 7 [Changed to 1-5!] and displays the name of the weekday. 
 */
import java.util.Scanner;

public class Weekday{
  public static void main(String[] args){

  //Declare variable
  int userInput;

  Scanner input = new Scanner(System.in);
    
//Changed from 1-7 because the scenario is asking for weekdays (only 5 weekdays)
  System.out.print("Input a number 1-5: ");
  userInput = input.nextInt();

  //Find weekday and display
  if (userInput == 1)
  {
    System.out.println("Monday");
  }
  else if (userInput == 2)
  {
    System.out.println("Tuesday");
  }
  else if (userInput == 3)
  {
    System.out.println("Wednesday");    
  }
  else if (userInput == 4)
  {
    System.out.println("Thursday");
  }
  else
  {
    System.out.println("Friday");
  }
  }
}