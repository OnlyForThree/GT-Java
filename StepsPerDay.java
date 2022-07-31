/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/27/22
 * Filename: StepsPerDay.java
 * Purpose: Prompts the user for the number of steps they walk for four days in a row. The program calculates the total number of steps, the average number of the steps, and converts the steps to miles as well. 
 */

import java.util.Scanner; // Import the Scanner class
import java.text.NumberFormat; //Import Number Format

public class StepsPerDay{
  public static void main(String[] args){
   
    //Declare variables
    double stepsAN = 0;
    double milesAN = 0;
    double averageStepsAN = 0;
    double averageMilesAN = 0;
    
    Scanner input = new Scanner(System.in);
    NumberFormat number = NumberFormat.getIntegerInstance();
    
    //Total all steps
    System.out.print("Enter number of steps for Day 1: ");
    stepsAN = stepsAN + input.nextDouble();
    System.out.print("Enter number of steps for Day 2: ");
    stepsAN = stepsAN + input.nextDouble();
    System.out.print("Enter number of steps for Day 3: ");
    stepsAN = stepsAN + input.nextDouble();
    System.out.print("\nEnter number of steps for Day 4: ");
    stepsAN = stepsAN + input.nextDouble();

    //Display total
    System.out.print("\nTotal number of steps: " + (number.format(stepsAN)));

    //Caluclate other total and averages
    milesAN = stepsAN/2000;
    averageStepsAN = stepsAN/4;
    averageMilesAN = (stepsAN/2000)/4;
    
    //Display other total and averages
    System.out.println("\nTotal number of miles: " + (number.format(milesAN)));
    System.out.println("\nAverage steps per day: " + (number.format(averageStepsAN)));
    System.out.println("Average miles per day: " + averageMilesAN);
  }
}