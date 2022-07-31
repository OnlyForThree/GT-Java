/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/30/22
 * Filename: MathTutor.java
 * Purpose:  A MathTutor application that displays math problems by randomly generating two numbers, 1 through 10 and an operator (*, +, –, /), and then prompts the user for an answer.
 */

import java.util.Scanner;
import java.lang.Math;

public class MathTutor{
  public static void main(String[] args){

  //Declare variables
    double userAnswerAN = 0; 
    double questionAnswerAN = 0;
    int randomHighOneAN = 10; 
    int randomHighTwoAN = 4; 
    int randomLowAN = 1; 
    int randomOneAN = (int)((randomHighOneAN -randomLowAN + 1) * Math.random() + randomLowAN);
    int randomTwoAN = (int)((randomHighOneAN -randomLowAN + 1) * Math.random() + randomLowAN);
    int randomOpperatorAN = (int)((randomHighOneAN -randomLowAN + 1) * Math.random() + randomLowAN);
    
    Scanner input = new Scanner(System.in);

    switch (randomOpperatorAN){
      case 1: System.out.print("What is " + randomOneAN + " + " + randomTwoAN + "?");
              questionAnswerAN = randomOneAN + randomTwoAN; break;
        
      case 2: System.out.print("What is " + randomOneAN + " - " + randomTwoAN + "?");
              questionAnswerAN = randomOneAN - randomTwoAN; break;
        
      case 3: System.out.print("What is " + randomOneAN + " * " + randomTwoAN + "?");
              questionAnswerAN = randomOneAN * randomTwoAN; break;
        
      case 4: System.out.print("What is " + randomOneAN + " / " + randomTwoAN + "?");
              questionAnswerAN = randomOneAN / randomTwoAN; break;
    }

    questionAnswerAN = (double)Math.round(questionAnswerAN * 100000d) / 100000d;
    userAnswerAN = input.nextDouble();

    if (questionAnswerAN == userAnswerAN)
    {
      System.out.println("Correct!");
    }
    else
    {
      System.out.println("Incorrect");
    }
  }
}