/**
 * 
 * Designer: Alex Nguyen + Sayo Odusote
 * Date: 7/7/22
 * Filename: DadJokesAndPuns.java
 * Purpose:  A DadJokesAndPuns application that prompts the user if they want dad jokes or puns: [1 for dad jokes] [2 for puns]
    Note: Use an if statement to check if the users chooses 1 or if the user chooses 2
A random number generator is used to randomly select a number 1-6
If the user's choice was 1, a random dad joke corresponding to the random number will be printed
If the user's choice was 2, a random pun corresponding to the random number will be printed
Note: Use switch statements for when the random generator generates a random number it’ll output a case from the switch statement. You can use a switch statement in the if statement that is used to check if the user chooses 1 or 2.
 */
import java.util.Scanner; //Import Scanner
import java.lang.Math; //Import Math language + functions

class DadJokesAndPuns {
  public static void main(String[] args) {
    //Declare variables
    int userChoiceAN;
    int randomHighAN = 6;//Random number maximum
    int randomLowAN = 1;//Random number minimum
    int randomNumberAN = (int)((randomHighAN - randomLowAN + 1) * Math.random() + randomLowAN); //Random number 1-6

    Scanner input = new Scanner(System.in);

    //Take user choice for input (1 or 2)
    System.out.print("Select the joke you want to hear [1 - Dad Joke] [2 - Pun]: ");
    userChoiceAN = input.nextInt();

    if (userChoiceAN == 1){ //If user choice is equal to 1, display a random dad joke
      switch (randomNumberAN){
        case 1: System.out.println("I'm afraid for the calendar. Its days are numbered."); break;
        case 2: System.out.println("My wife said I should do lunges to stay in shape. That would be a big step forward."); break;
        case 3: System.out.println("Why do fathers take an extra pair of socks when they go golfing?"  + "\nIn case they get a hole in one!"); break;
        case 4: System.out.println("Singing in the shower is fun until you get soap in your mouth. Then it's a soap opera."); break;
        case 5: System.out.println("What do you call a fish wearing a bowtie?"  + "\nSofishticated."); break;
        case 6: System.out.println("What did the janitor say when he jumped out of the closet?" + "\nSupplies!"); break;
      }
    }
    else if (userChoiceAN == 2){ //If user choice is equal to 2, display a random pun
      switch (randomNumberAN){
        case 1: System.out.println("What kind of concert only costs 45 cents? A 50 Cent concert featuring Nickelback."); break;
        case 2: System.out.println("What did the grape say when it got crushed? \nNothing, it just let out a little wine."); break;
        case 3: System.out.println("I want to be cremated as it is my last hope for a smoking hot body."); break;
        case 4: System.out.println("Singing in the shower is fun until you get soap in your mouth. \nThen it's a soap opera."); break;
        case 5: System.out.println("Can February March? \nNo, but April May."); break;
        case 6: System.out.println("What did the janitor say when he jumped out of the closet? \nSupplies!"); break;
      }
    }
  }
}