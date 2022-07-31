/**
*Name: Alex Nguyen
*Date: 07/21/22
*Program Name: HiLo.java
*Purpose: A HiLo prgram that prompts the user for a prediction if the random number is higher or lower than 7. The user gains and loses points based of if they're correct or incorrect. The program ends when the user has no more points or has reached 4000 points
*/

import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

public class HiLo{
  public static void main(String[] args){
    int totalPointsAN = 1000, riskPointsAN = 0, predictionAN = 0;
    boolean playStatusAN = true;
    System.out.println("High Low Game\n");
    System.out.println("RULES");
    System.out.println("Numbers 1 through 6 are low");
    System.out.println("Numbers 8 through 13 are high");
    System.out.println("Number 7 is neither high or low");

    do{
      displayPoints(totalPointsAN);

      riskPointsAN = collectRiskedPoints();

      predictionAN = collectPrediction();

      totalPointsAN = highOrLow(predictionAN, riskPointsAN, totalPointsAN);

      playStatusAN = playAgain();
    } while (((totalPointsAN > 0) && (totalPointsAN < 4000)) && playStatusAN);
  }

  public static void displayPoints(int totalPointsAN){
    System.out.println("\nYou have " + totalPointsAN + " points.\n");
  }

  public static int collectRiskedPoints(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter points to risk: ");
    return input.nextInt();
  }

  public static int collectPrediction(){
    Scanner input = new Scanner(System.in);
    System.out.print("\nPredict <1=High, 0=Low>: ");
    return input.nextInt();
  }

  public static int highOrLow(int predictionAN, int riskPointsAN, int totalPointsAN){
    int randomNumberAN = (int) ((13 + 1 - 1) * Math.random() + 1);
    boolean winOrLoseAN;
    while (randomNumberAN == 7){
      randomNumberAN = (int) ((13 + 1 - 1) * Math.random() + 1);
    }

    System.out.println("Number is " + randomNumberAN);

    if ((randomNumberAN > 7) && (predictionAN == 1)){
      System.out.println("You win.");
      winOrLoseAN = true;
    }
    else if ((randomNumberAN < 7) && (predictionAN == 0)){
      System.out.println("You win.");
      winOrLoseAN = true;
    }
    else{
      System.out.println("You lose.");
      winOrLoseAN = false;
    }

    if (winOrLoseAN){
      return totalPointsAN + (riskPointsAN * 2);
    }
    else{
      return totalPointsAN - riskPointsAN;
    }
  }

  public static boolean playAgain(){
    boolean playAgainAN = true;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Play again? ");
    String playAnswerAN = input.next();
    
    if (playAnswerAN.equals("y")){
      playAgainAN = true;
    }
    else if (playAnswerAN.equals("n")){
      playAgainAN = false;
    }

    return playAgainAN;
  }
}