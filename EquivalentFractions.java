/**
 * 
 * Designer: Alex Nguyen
 * Date: 7/1/22
 * Filename: EquivalentFractions.java
 * Purpose:  An EquivalentFractions application that quizzes the user on equivalent fractions. Equivalent fractions have the same value, even though they may look different.
 */

import java.util.Scanner; //Import Scanner class
import java.lang.Math; //Import math

public class EquivalentFractions{
  public static void main(String[] args){

    //Declare cariables
    int modeAN;
    int userAnswerAN = 0;
    int randomLowAN = 1;
    int randomHighAN = 8;
    int randomNumberAN = (int)((randomHighAN - randomLowAN + 1) * Math.random() + randomLowAN);
    
    Scanner input = new Scanner(System.in);

    //Receive mode from user
    System.out.print("Type the mode you want to play [1 for Matching] or [2 for Random]: ");
    modeAN = input.nextInt();

    //Display fractions
    System.out.println("\nEqivalent Fractions Quiz");
      System.out.println("\n\t1. 21/3");
      System.out.println("\t2. 2/3");
      System.out.println("\t3. 4/3");
      System.out.println("\t4. 28/4");
      System.out.println("\t5. 8/12");
      System.out.println("\t6. 1 1/3");
      System.out.println("\t7. 5/1");
      System.out.println("\t8. 25/5\n"); //Changed 125 to 25 (7 and 8 wouldn't match if not changed)
    

    if (modeAN == 1)
    {
      //Take input for first fraction
      System.out.print("Match the first equivalent fraction number: ");
      userAnswerAN = userAnswerAN + input.nextInt();

      //Take input for second fraction
      System.out.print("\n\nMatch the second equivalent fraction number: ");
      userAnswerAN = userAnswerAN + input.nextInt();

      //Add the corresponding fraction numbers and check if correct + Display result
      if (((userAnswerAN == 5) || (userAnswerAN == 7)) || ((userAnswerAN == 9) || (userAnswerAN == 15)))
      {
      System.out.println("\nCorrect!");
      }
      else
      {
      System.out.println("\nIncorrect.");
      }
    }
    else if (modeAN == 2)
      {
      //Take input for question
      System.out.print("Which fraction is equivalent to fraction #" + randomNumberAN + "? ");
      userAnswerAN =  randomNumberAN + input.nextInt();

      //Add the corresponding fraction numbers and check if correct + Display result
      if (((userAnswerAN == 5) || (userAnswerAN == 7)) || ((userAnswerAN == 9) || (userAnswerAN == 15)))
      {
      System.out.println("Correct!");
      }
    else
      {
      System.out.println("Incorrect.");
      }
    }
  }
}