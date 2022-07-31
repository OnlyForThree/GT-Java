/**
*Name: Alex Nguyen
*Date: 07/26/22
*Program Name: SeperatedByDots.java
*Purpose: Prints the first word and the second word while seperating them by dots to make the string length equal to 30
*/
import java.util.Scanner;
import java.lang.String;

public class SeperatedByDots{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first word:");
    String firstWordAN = input.next();

    System.out.println("Enter the second word:");
    String secondWordAN = input.next();

    int dotCountAN = 30 - firstWordAN.length() - secondWordAN.length();

    System.out.print("\n\n" + firstWordAN);

    for(int i = 1; i<= dotCountAN; i++){
      System.out.print(".");
    }

    System.out.print(secondWordAN);
    
  }
}