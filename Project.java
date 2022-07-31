/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/28/22
 * Filename: Project.java
 * Purpose: A Project application to help analyze the time taken for a Java project. 
 */

import java.util.Scanner; // Import the Scanner

public class Project{
  public static void main(String[] args){
    //Declare variables
    double designingAN = 0;
    double codingAN = 0;
    double debuggingAN = 0;
    double testingAN = 0;
    double totalTimeAN = 0;
      
    Scanner input = new Scanner(System.in);
    
    //Collect all inputs for variables
    System.out.println("Eneter the number of minutes spent on each of the following project tasks:\n\n");
    System.out.print("Designing: ");
    designingAN = input.nextDouble();
    totalTimeAN = totalTimeAN + designingAN;
    System.out.print("Coding: ");
    codingAN = input.nextDouble();
    totalTimeAN = totalTimeAN + codingAN;
    System.out.print("Debugging: ");
    debuggingAN = input.nextDouble();
    totalTimeAN = totalTimeAN + debuggingAN;
    System.out.print("Testing: ");
    testingAN = input.nextDouble();
    totalTimeAN = totalTimeAN + testingAN;

    //Update variables
    designingAN = designingAN / totalTimeAN;
    codingAN = codingAN / totalTimeAN;
    debuggingAN = debuggingAN / totalTimeAN;
    testingAN = testingAN / totalTimeAN;
    
    //Display results
    System.out.format("%-15s %2s %1s", "\nTask", "%", "Time\n");
    System.out.format("%-15s %.2f %1s", "Designing", designingAN * 100, "%\n");
    System.out.format("%-15s %.2f %1s", "Coding", codingAN * 100, "%\n");
    System.out.format("%-15s %.2f %1s", "Debugging", debuggingAN * 100, "%\n");
    System.out.format("%-15s %.2f %1s", "Testing", testingAN * 100, "%\n");
  }
}