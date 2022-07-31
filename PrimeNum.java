/**
*Name: Alex Nguyen
*Date: 07/12/22'
Program Name: PrimeNum.java
*Purpose: The program has two modes:
*-Prompts the user for a number and then displays a message indicating whether the number is prime or not
*-Prompts the user for two numbers then displays the prime numbers between those numbers
*/
import java.util.Scanner; //Import Scanner

public class PrimeNum{
  public static void main(String[] args){
    //Declare variables
    int userNumOneAN, userNumTwoAN, modeAN;

    Scanner input = new Scanner(System.in);

    //Get user mode choice as input
    System.out.print("Enter the mode you would like to use [1 - Prime Check] [2 - Find Prime]: ");
    modeAN = input.nextInt();

    //If the user picks Prime Check mode:
    if (modeAN == 1){
      
    //Collect number for prime checking
     System.out.print("Enter a number between 1 and 100 (Inclusive): ");
     userNumOneAN = input.nextInt();

      //If the number is between 1 and 100 (Inclusive)
      if ((userNumOneAN >= 1) && (userNumOneAN <= 100)){
        switch (userNumOneAN){ //Display reply based on the number entered
          case 1: System.out.println("This number is prime."); break;
          case 2: System.out.println("This number is prime."); break;
          case 3: System.out.println("This number is prime."); break;
          case 5: System.out.println("This number is prime."); break;
          case 7: System.out.println("This number is prime."); break;
          case 11: System.out.println("This number is prime."); break;
          case 13: System.out.println("This number is prime."); break;
          case 17: System.out.println("This number is prime."); break;
          case 19: System.out.println("This number is prime."); break;
          case 23: System.out.println("This number is prime."); break;
          case 29: System.out.println("This number is prime."); break;
          case 31: System.out.println("This number is prime."); break;
          case 37: System.out.println("This number is prime."); break;
          case 41: System.out.println("This number is prime."); break;
          case 43: System.out.println("This number is prime."); break;
          case 47: System.out.println("This number is prime."); break;
          case 53: System.out.println("This number is prime."); break;
          case 59: System.out.println("This number is prime."); break;
          case 61: System.out.println("This number is prime."); break;
          case 67: System.out.println("This number is prime."); break;
          case 71: System.out.println("This number is prime."); break;
          case 73: System.out.println("This number is prime."); break;
          case 79: System.out.println("This number is prime."); break;
          case 83: System.out.println("This number is prime."); break;
          case 89: System.out.println("This number is prime."); break;
          case 97: System.out.println("This number is prime."); break;
          default: System.out.println("This number is not prime"); break;
      }
        
        }
      else{ //If the number is not between 1 and 100 (Inclusive)
        System.out.print("Make sure to enter a number that is between 1 and 100 (Inclusive)"); //Ask for a valid number
      }
      
    }
    else if (modeAN == 2){ //If the user picks Find Prime mode:

      //Collect range minimum
      System.out.print("Enter the range minimum (No lower than 1): ");
      userNumOneAN = input.nextInt();

      //Collect range maximum
      System.out.print("Enter the range maximum (No high than 100): ");
      userNumTwoAN = input.nextInt();

      //If the minimum is greater than or equal to 1, maximum is less than or equal to 100, and maximum is greater than minimum
      if (((userNumOneAN >= 1) && (userNumTwoAN <= 100)) && (userNumTwoAN > userNumOneAN)){
        System.out.println("Prime numbers in your range of " + userNumOneAN + " and " + userNumTwoAN + " are: ");
        
        for(int i = userNumOneAN; i <= userNumTwoAN; i++) {
	       switch (i){ //Go through the numbers in the range and display answers
          case 1: System.out.println(1); break;
          case 2: System.out.println(2); break;
          case 3: System.out.println(3); break;
          case 5: System.out.println(5); break;
          case 7: System.out.println(7); break;
          case 11: System.out.println(11); break;
          case 13: System.out.println(13); break;
          case 17: System.out.println(17); break;
          case 19: System.out.println(19); break;
          case 23: System.out.println(23); break;
          case 29: System.out.println(29); break;
          case 31: System.out.println(31); break;
          case 37: System.out.println(37); break;
          case 41: System.out.println(41); break;
          case 43: System.out.println(43); break;
          case 47: System.out.println(47); break;
          case 53: System.out.println(53); break;
          case 59: System.out.println(59); break;
          case 61: System.out.println(61); break;
          case 67: System.out.println(67); break;
          case 71: System.out.println(71); break;
          case 73: System.out.println(73); break;
          case 79: System.out.println(79); break;
          case 83: System.out.println(83); break;
          case 89: System.out.println(99); break;
          case 97: System.out.println(97); break;
         }
        }
      }
    }
    else{ //If range maximum and minimum do not fit criteria, ask for valid inputs
      System.out.println("Please enter the numbers 1 or 2 to select a mode.");
    }
  }
}