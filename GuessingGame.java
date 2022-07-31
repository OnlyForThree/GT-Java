/**
 * 
 * Designer: Alex Nguyen
 * Date: 7/1/22
 * Filename: GuessingGame.java
 * Purpose: A number guessing game played between the computer and one player.
 */

import java.util.Scanner; //Import Scanner class
import java.lang.Math; //Import math

public class GuessingGame{
  public static void main(String[] args){
    //Declare variables
    int userGuessAN;
    int randomLowAN = 1;
    int randomHighAN = 20;
    int randomNumber = (int)((randomHighAN - randomLowAN + 1) * Math.random() + randomLowAN);

    Scanner input = new Scanner(System.in);

    //Take user guess
    System.out.print("Enter a number between 1 and 20: ");
    userGuessAN = input.nextInt();

    System.out.println("Computer's Number: " + randomNumber);
    System.out.println("Player's Number: " + userGuessAN);

    //Check guess and display result
    if (randomNumber == userGuessAN)
    {
      System.out.println("You won!");
    }
    else
    {
      System.out.println("Better luck next time.");
    }
  }
}