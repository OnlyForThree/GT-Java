/**
*Name: Alex Nguyen
*Date: 07/26/22
*Program Name: HiLo2.java
*Purpose: A HiLo prgram that prompts the user for a prediction if the random number is higher or lower than 7. The user gains and loses points based of if they're correct or incorrect. The program ends when the user has no more points or has reached 4000 points
*/

import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

public class HiLo2{
  public static void main(String[] args){
    int totalOnePointsAN = 1000, totalTwoPointsAN = 1000, riskPointsOneAN = 0, riskPointsTwoAN = 0, predictionOneAN = 0, predictionTwoAN = 0;
    boolean playStatusAN = true;
    Scanner input = new Scanner(System.in);
    System.out.println("High Low Game\n");
    System.out.println("RULES");
    System.out.println("Numbers 1 through 6 are low");
    System.out.println("Numbers 8 through 13 are high");
    System.out.println("Number 7 is neither high or low");

    System.out.print("Enter the first player's name: ");
    String usernameOneAN = input.next();

    System.out.print("Enter the second player's name: ");
    String usernameTwoAN = input.next();
    
    do{
      System.out.println(usernameOneAN);
      displayPoints(totalOnePointsAN);
      riskPointsOneAN = collectRiskedPoints(totalOnePointsAN);
      predictionOneAN = collectPrediction();
      totalOnePointsAN = highOrLow(predictionOneAN, riskPointsOneAN, totalOnePointsAN);
      playStatusAN = playAgain();

      System.out.println(usernameTwoAN);
      riskPointsTwoAN = collectRiskedPoints(totalTwoPointsAN);
      predictionTwoAN = collectPrediction();
      totalTwoPointsAN = highOrLow(predictionTwoAN, riskPointsTwoAN, totalTwoPointsAN);
      playStatusAN = playAgain();
    } while ((((totalOnePointsAN > 0) && (totalOnePointsAN < 4000)) && playStatusAN) && (((totalTwoPointsAN > 0) && (totalTwoPointsAN < 4000)) && playStatusAN));
  }

  public static void displayPoints(int totalPointsAN){
    System.out.println("\nYou have " + totalPointsAN + " points.\n");
  }

  public static int collectRiskedPoints(int totalPointsAN){
    Scanner input = new Scanner(System.in);
    int i = 0;
    System.out.println("Press 1 to wager all remaining points");
    System.out.println("Press 2 to wager 50 points (minimum amount)");
    System.out.println("Press 3 to wager 100 points");
    System.out.println("Press 4 to wager 250 points");
    System.out.println("Press 5 to wageer 500 points");
    int riskChoiceAN = input.nextInt();

    switch(riskChoiceAN){
      case 1: i = totalPointsAN;
      case 2: i = 50;
      case 3: i = 100;
      case 4: i = 250;
      case 5: i = 500;
    }

    return i;
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