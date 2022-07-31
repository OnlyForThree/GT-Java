/**
*Name: Alex Nguyen
*Date: 07/26/22
*Program Name: EchoAWord.java
*Purpose: Prints out the user's given word as many times as the length of the word
*/
import java.util.Scanner;
import java.lang.String;

public class EchoAWord{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a word:");
    String userInputAN = input.next();

    System.out.println("");
    
    for(int i = 1; i<= userInputAN.length(); i++){
      System.out.println(userInputAN);
    }
  }
}