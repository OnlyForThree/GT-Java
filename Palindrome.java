/**
Name: Alex Nguyen
Date: 07/29/22
Program Name: Palindrome.java
Purpose: A Palindrome application that prompts the user for a word or phrase that they would like to check.
The program then tells them if it is a palindrome
*/
import java.lang.String;
import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the word you would like to test: ");
    String userInputAN = input.nextLine();

    if(isPalindrome(stringBreakdown(userInputAN))){
      System.out.println("The word/phrase " + userInputAN + " is a palindrome");
    }
    else{
      System.out.println("The word/phrase " + userInputAN + " is not a palindrome");
    }
  }

  public static boolean isPalindrome(String stringAN){
    boolean statusAN = false;
    for (int i = 0; i < stringAN.length()/2; i++){
      if (stringAN.charAt(i) != stringAN.charAt(stringAN.length()- 1 - i)){
        statusAN = false;
      }
      else{
        statusAN = true;
      }
    }
    return statusAN;
  } 

  public static String stringBreakdown(String userInputAN){
    String tempAN = userInputAN;

    tempAN = tempAN.replaceAll(" ", "");
    tempAN = tempAN.toLowerCase();

    return tempAN;
  }
} 
