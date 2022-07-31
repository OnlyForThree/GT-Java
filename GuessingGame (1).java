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
    int counterAN = 0;
    int randomLowAN = 1;
    int randomHighAN = 20;
    int randomNumberAN = (int)((randomHighAN - randomLowAN + 1) * Math.random() + randomLowAN);

    Scanner input = new Scanner(System.in);

    do{
    //Take user guess
    System.out.print("Enter a number between 1 and 20: ");
    userGuessAN = input.nextInt();

    //If correct number is higher
    if (randomNumberAN > userGuessAN)
    {
      //Tell user their guess is too low
      System.out.println("Too Low");
    }
    //If the correct number is lower
    else if (randomNumberAN < userGuessAN)
    {
      //Tell the user their guess is too high
      System.out.println("Too High");
    }

    counterAN++; //Increase the ocunter
    } while(userGuessAN != randomNumberAN); //Repeat while the user hasn't guessed correctly

    if (counterAN <= 5) //If the user guesses in 5  or less tries
    {
    System.out.println("Great job! You guessed it in " + counterAN + " tries!"); //They did a good job
    }
    else if (counterAN <= 10) //If the user guesses in 10 or less ties
    {
    System.out.println("You did an okay job! You guessed in " + counterAN + " tries!"); //They did an okay jpb
    }
    else //If they took for than 10 tries
    {
    System.out.println("You did a pretty bad job! You guessed in " + counterAN + " tries!"); //They did a bad job
    }
  }
}