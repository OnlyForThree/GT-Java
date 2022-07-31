/**
*Name: Alex Nguyen
*Date: 07/26/22
*Program Name: RunOfIntegers.java
*Purpose: Prompts the user for a starting value and an ending value. Then displays all the integers between the starting and ending value (inclusive)
*/
import java.util.Scanner;

public class RunOfIntegers{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter start:");
    int startAN = input.nextInt();

    System.out.println("Enter end:");
    int endAN = input.nextInt();

    System.out.println("");

    for(int i = startAN; i <= endAN; i++){
      System.out.println(i);
    }
  }
}