/**
*Name: Alex Nguyen
*Date: 07/18/22
*Project Name: Monogram.java
*Purpose: a Monogram application the prompts the user for his or her first name, middle name and last name.  The program will display a:
lowercase first initial
upper case last initial
lowercase middle initial
*/

import java.util.Scanner; //Import Scanner Class
import java.lang.String; //Import String Class

public class RemoveString {
  public static void main(String[] args) {
    String fullStringAN, checkStringAN, newStringAN, charSpaceAN = "";
    
    Scanner input = new Scanner(System.in);

    //Take name input
    System.out.println("RemoveString");
    System.out.print("Enter a sentence: ");
    fullStringAN = input.nextLine();
    fullStringAN = fullStringAN.trim();

    System.out.print("Enter a string to remove: ");
    checkStringAN = input.nextLine();
    checkStringAN = checkStringAN.trim();
    
    newStringAN = fullStringAN.replaceAll(checkStringAN + " ", charSpaceAN.trim());

    System.out.println("\nNew Phrase: " + newStringAN);
  }
}