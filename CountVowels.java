/**
*Name: Alex Nguyen
*Date: 07/20/22
*Program Name: CountVowels.java
*Purpose: A CountVowels application that prompts the user for a string and then display the string and  a count of the number of vowels in the string.
*/

import java.util.Scanner;
import java.lang.String;

public class CountVowels{
  public static void main(String args[]){
    String textInputAN, upperTextInputAN;
    int vowelCountAN = 0;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter text: ");
    textInputAN = input.nextLine();
    upperTextInputAN = textInputAN.toUpperCase();
    
    for(int j = 0; j < upperTextInputAN.length(); j++){
      if (upperTextInputAN.substring((j) , (j + 1)).equals("A")){
        vowelCountAN++;
      }
      if (upperTextInputAN.substring((j) , (j + 1)).equals("E")){
        vowelCountAN++;
      }
      if (upperTextInputAN.substring((j) , (j + 1)).equals("I")){
        vowelCountAN++;
      }
      if (upperTextInputAN.substring((j) , (j + 1)).equals("O")){
        vowelCountAN++;
      }
      if (upperTextInputAN.substring((j) , (j + 1)).equals("U")){
        vowelCountAN++;
      }
    }

    System.out.println("The number of vowels in " + textInputAN + " is " + vowelCountAN);
  }
}