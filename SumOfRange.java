/**
*Name: Alex Nguyen
*Date: 07/26/22
*Program Name: SumOfRange.java
*Purpose: Prompts the user for a low and high. The program then prints the sum of all the integers in that range
*/
import java.util.Scanner;

public class SumOfRange{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int sumAN = 0;
    System.out.println("Enter low:");
    int lowAN = input.nextInt();

    System.out.println("Enter high:");
    int highAN = input.nextInt();

    for(int i = lowAN; i <= highAN; i++){
      sumAN = sumAN + i;
    }

    System.out.println("Sum = " + sumAN);
  }
}