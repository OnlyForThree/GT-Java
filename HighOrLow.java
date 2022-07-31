/**
*Program name: HighOrLow.java
*New Program attempt: Alex Nguyen + Sayo Odusote
*Designer: Ava Xu + Nathan Zhang
*Program purpose: A guessing game that prompts the user to guess the random number based on the difficulty rating. Feedback based on the number's positioning will be providied after each guess. The user has 2 attempts.
*/
import java.util.Scanner;
import java.lang.Math;

public class HighOrLow {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
    
   int userChoice, userGuess;

   int randomHigh = 0;//Random number maximum
   int randomLow = 0;//Random number minimum
    
   System.out.print(" 1 - easy, 2 - medium, 3 - hard, 4 - impossible \nSelect: ");
   userChoice = input.nextInt();

  if (userChoice == 1){
    System.out.print("Easy range: 1 - 5"); 
    randomHigh = 5;
    randomLow = 1;
  }
  else if (userChoice == 2){
     System.out.print("Medium Range: 1 - 10"); 
    randomHigh = 10;
    randomLow = 1;
  }
  else if (userChoice == 3){
      System.out.print("Hard Range:  1 - 20");
   randomHigh = 20;
    randomLow = 1;
  }
  else if (userChoice == 4){
    System.out.print("Impossible Range: 1 - 100");
    randomHigh = 100;
    randomLow = 1;
  }
  System.out.println("\nYou have 3 guesses to find out what number the computer is thinking.");
    
  int randomNumber = (int)((randomHigh - randomLow + 1) * Math.random() + randomLow); //Random number

  System.out.print("Enter your first guess: ");
  userGuess = input.nextInt();

  if (userGuess == randomNumber){
    System.out.println("You got it!");
  }
    else if (userGuess != randomNumber){
      if (userGuess > randomNumber){
        System.out.println("Lower");
        System.out.print("\nEnter your second guess: ");
        userGuess = input.nextInt();
        
        if(userGuess == randomNumber){
        System.out.println("You got it!");
        }
        else if (userGuess != randomNumber){
          if (userGuess > randomNumber){
          System.out.println("Higher");
          System.out.print("\nEnter your third guess: ");
          userGuess = input.nextInt();
            if (userGuess == randomNumber){
              System.out.println("You got it!");
            }
            else{
              System.out.println("You lost.");
            }
          }
          else if (userGuess < randomNumber){
          System.out.println("Lower"); 
          System.out.print("\nEnter your third guess: ");
          userGuess = input.nextInt();
          if (userGuess == randomNumber){
              System.out.println("You got it!");
          }
          else{
              System.out.println("You lost.");
          }
      }
    }
  }
      else if (userGuess < randomNumber){
        System.out.println("Lower");
        System.out.print("\nEnter your second guess: ");
        userGuess = input.nextInt();
        
        if(userGuess == randomNumber){
        System.out.println("You got it!");
        }
        else if (userGuess != randomNumber){
          if (userGuess > randomNumber){
          System.out.println("Higher");
          System.out.print("\nEnter your third guess: ");
          userGuess = input.nextInt();
            if (userGuess == randomNumber){
              System.out.println("You got it!");
            }
            else{
              System.out.println("You lost.");
            }
          }
          else if (userGuess < randomNumber){
          System.out.println("Lower"); 
          System.out.print("\nEnter your third guess: ");
          userGuess = input.nextInt();
          if (userGuess == randomNumber){
              System.out.println("You got it!");
          }
          else{
              System.out.println("You lost.");
          }
      }
    }
  }
    }
  }
}