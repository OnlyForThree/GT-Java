/**
*Name: Alex Nguyen
*Date: 07/15/22
*Program Name: PasswordChecker.java
*Purpose: A program that repeatedly asks the user for a proposed password until the user enters an acceptable password. 
When the user enters an acceptable password, the program writes a message and exits.
*/

import java.util.Scanner; //Import Scanner
import java.lang.String; //Import string methods

public class PasswordChecker {
  public static void main(String[] args) {
    
    String passwordInputAN, passwordCapitalAN; //Declare string variables for capitalization checking
    int errorCounterAN = 0, capitalCounterAN = 0, numberCounterAN = 0, symbolCounterAN = 0; //Declare int variables for counting

    Scanner input = new Scanner(System.in);

    do{ //Run the function
    System.out.println("\nEnter your password: "); //Ask for password input
    passwordInputAN = input.next(); //Take password input
      
    if (passwordInputAN.length() < 7){ //If the password is less than 7 characters in length
      System.out.println("That password is not enough characters"); //Print that the password does not have enough characters
      errorCounterAN = errorCounterAN + 1; //Count the error
    }

    passwordCapitalAN = passwordInputAN.toUpperCase(); //Update passwordCapitalAN variable to match the input

    for (int i = 0; i <= passwordInputAN.length() - 1; i++){ //Repeat for the length of the pasword input
      String currentCharAN = passwordInputAN.substring(i, (i+1)); //Create local variable that keep tracks of the current character being checked
      
      if (currentCharAN.equals(passwordCapitalAN.substring(i, (i+1)))){ //If the capitalized char matches the original
        capitalCounterAN++; //Count the capital number
      }

      for(int j = 0; j <= 9; j++){ //Repeat 9 times
        String currentNumberAN = String.valueOf(j); //Create local variable that keep tracks of the loop number
        if (currentCharAN.equals(currentNumberAN)){ //If the current character being checked is a number
          numberCounterAN++; //Count the number
        }
      }

      if (currentCharAN.equals("!")){ //If the current character being checked is !
        symbolCounterAN++; //Count the symbol
      }
      if (currentCharAN.equals("@")){//If the current character being checked is @
        symbolCounterAN++; //Count the symbol
      }
      if (currentCharAN.equals("#")){//If the current character being checked is #
        symbolCounterAN++; //Count the symbol
      }
      if (currentCharAN.equals("$")){//If the current character being checked is $
        symbolCounterAN++; //Count the symbol
      }
      if (currentCharAN.equals("%")){//If the current character being checked is %
        symbolCounterAN++; //Count the symbol
      }
      if (currentCharAN.equals("^")){//If the current character being checked is ^
        symbolCounterAN++; //Count the symbol
      }
      if (currentCharAN.equals("&")){//If the current character being checked is &
        symbolCounterAN++; //Count the symbol
      }
      if (currentCharAN.equals("*")){//If the current character being checked is *
        symbolCounterAN++; //Count the symbol
      }
      
    }

      if (capitalCounterAN == 0){ //If there are no capital letters counted
        System.out.println("That password needs at least one upper case character"); //Tell the user they need a capital letter
        errorCounterAN++;
      }
      
      if (numberCounterAN == 0){ //If there are no numbers counted
        System.out.println("That password needs at least one digit"); //Tell the user they need a number
        errorCounterAN++;
      }

      if (symbolCounterAN == 0){ //If there are no symbols counted
        System.out.println("That password needs at least one special character"); //Tell the user they need a symbol
        errorCounterAN++;
      }
      
      if (errorCounterAN == 0){ //If there are no errors counted
        System.out.println("\nAcceptable password\n"); //Tell the user their password is acceptable
        passwordInputAN = "end"; //Update passwordInputAN to end the do-while loop
      } 

      errorCounterAN = 0; //Reset the errorCounterAN for the next loop run
      
    } while (! (passwordInputAN.equals("end"))); //Repeat while the password input is not equal to "end"
  } 
}
