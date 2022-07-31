/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/28/22
 * Filename: Election.java
 * Purpose: An Election application that will prompt the user for the number of Votes for two candidates - Awbrey and Martinez.  After prompting for the number of votes from each state, calculate the percentage of votes for both candidates and display the results. 
 */

import java.util.Scanner; // Import the Scanner
import java.text.NumberFormat; //Import the Nmber Format

public class Election{
  public static void main(String[] args){
    //Declare variable
    double awbreyTotalAN = 0;
    double martinezTotalAN = 0;
    double awbreyPercentageAN = 0;
    double martinezPertenctageAN = 0;
    double totalVotesAN = 0;
    Scanner input = new Scanner(System.in);
    NumberFormat number = NumberFormat.getIntegerInstance();
    NumberFormat percent = NumberFormat.getPercentInstance();
    
    //Total all steps
    System.out.print("Enter the number of votes for Awbrey: ");
    awbreyTotalAN = input.nextDouble();
    System.out.print("Enter the number of votes for Martinez: ");
    martinezTotalAN = input.nextDouble();

    totalVotesAN = awbreyTotalAN + martinezTotalAN;
    awbreyPercentageAN = awbreyTotalAN / totalVotesAN;
    martinezPertenctageAN = martinezTotalAN / totalVotesAN;

    //Display total + averages
    System.out.format("%-15s %5s %5s", "\nCandidate", "Votes", "Percentage\n");
    System.out.format("%-8s %10s %.2f %1s", "Awbrey", number.format(awbreyTotalAN), awbreyPercentageAN * 100, "%\n");
    System.out.format("%-8s %10s %.2f %1s", "Martinez", number.format(martinezTotalAN), martinezPertenctageAN * 100, "%\n");
    System.out.println("\nTOTAL VOTES: \t +" + number.format(totalVotesAN));
  }
}