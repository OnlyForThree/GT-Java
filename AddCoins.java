/**
*Name: Alex Nguyen
*Date: 07/26/22
*Program Name; AddCoins.java
*Purpose: An application that returns the value of coins back to the user in dollars according to the user's coin inputs
*/
import java.util.Scanner;
import java.text.NumberFormat;

public class AddCoins {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter your total coins:\n");

    System.out.print("Quarters: ");
    int quartersAN = input.nextInt();

    System.out.print("Dimes: ");
    int dimesAN = input.nextInt();

    System.out.print("Nickels: ");
    int nickelsAN = input.nextInt();

    System.out.print("Pennies: ");
    int penniesAN = input.nextInt();

    System.out.print("\nTotal: " + getDollarAmount(quartersAN, dimesAN, nickelsAN, penniesAN));
  }

  public static String getDollarAmount(int quartersAN, int dimesAN, int nickelsAN, int penniesAN){
    NumberFormat money = NumberFormat.getCurrencyInstance();
    double totalAN = (quartersAN * 0.25) + (dimesAN * 0.1) + (nickelsAN * 0.05) + (penniesAN * 0.01);

    return money.format(totalAN);
  }
}