/**
*Name: Alex Nguyen
*Date: 07/26/22
*Program Name: FurtherSubstring.java
*Purpose: Prints a substring of the user's input starting at the given index and ending at the ending index
*/
import java.util.Scanner;
import java.lang.String;

public class FurtherSubstring {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a string:");
    String userInputAN = input.nextLine();

    System.out.print("Enter beginning index: ");
    int startIndexAN = input.nextInt();

    System.out.print("Enter ending index: ");
    int endIndexAN = input.nextInt();

    System.out.println("\nOriginal string:\n" + userInputAN);
    System.out.println("\nSubstring:\n" + userInputAN.substring(startIndexAN, endIndexAN));
    
  }
}