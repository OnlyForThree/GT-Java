/*
*Name: Alex Nguyen
*Date: 07/15/22
*Program Name: WordTriangle.java
*Program Purpose: A program that asks the user for a word, and then writes out that word once per line but for each line replace the first character of the word with a space and remove the last character of the word
**/

import java.util.Scanner; //Import scanner
import java.lang.String; //Import string methods

public class WordTriangle {
  public static void main(String[] args) {
    
    String userInputAN = ""; //Declare string variable for user input
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a word -->"); //Ask for word input
    userInputAN = input.next(); //Open scanner to collect input
    input.close(); //Close scanner

    for (int i = 0; i <= (userInputAN.length() / 2); i++){ //Repeat for half the length of userInputAN
      
      for (int j = 0; j <= i; j++){ //Repeat until the out loop counter
        System.out.print(" "); //Print " "
      }

      System.out.print(userInputAN.substring(i, (userInputAN.length() - i)) + "\n");
      //Print the original word starting at index of i and ending i characters early
    }
  }
}