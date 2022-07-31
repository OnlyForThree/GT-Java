/**
*Name: Alex Nguyen
*Date: 07/26/22
*Program Name: AddingUp.java
*Purpose: Asks the user how many times an integer will be added, then adds up that many integers
*/
import java.util.Scanner;

public class AddingUp{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int sumAN = 0;
    
    System.out.println("How many integers will be added:");
    int integerNumberAN = input.nextInt();

    for(int i = 1; i <= integerNumberAN; i++){
      System.out.println("Enter an integer:");
      sumAN = sumAN + input.nextInt();
    }

    System.out.println("\nThe sum is " + sumAN);
  }
}