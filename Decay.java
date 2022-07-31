/**
 * 
 * Designer: Alex Nguyen
 * Date: 7/6/22
 * Filename: Decay.java
 * Purpose:  A Decay application that  prompts the user to select one of the three choices and based on the selected option prompts the user to enter the appropriate known information. Answers then return based on the user selection
 */
import java.util.Scanner;
import java.lang.Math;

class Decay {
  public static void main(String[] args) {
    int initialValueAN, decayTimeAN, userModeAN;
    double constantAN, finalAmountAN;

    Scanner input = new Scanner(System.in);

    System.out.println("1. Final Amount");
    System.out.println("2. Initial Amount");
    System.out.println("3. Constant (half-life");
    
    System.out.print("Find: ");
    userModeAN = input.nextInt();

    if (userModeAN == 1){
      System.out.print("Enter the initial value (n): ");
      initialValueAN = input.nextInt();

      System.out.print("Enter the constant (k): ");
      constantAN = input.nextDouble();

      System.out.print("Enter the decay time (t): ");
      decayTimeAN = input.nextInt();

      System.out.println("The final amount: " + initialValueAN * Math.exp((-1 * constantAN) * decayTimeAN));
    }
    else if (userModeAN == 2){
      System.out.print("Enter the final amount value (y): ");
      finalAmountAN = input.nextDouble();

      System.out.print("Enter the constant (k): ");
      constantAN = input.nextDouble();

      System.out.print("Enter the decay time (t): ");
      decayTimeAN = input.nextInt();

      System.out.println("The final amount: " + finalAmountAN / (Math.exp((-1 * constantAN) * decayTimeAN)));
    }
    else if (userModeAN == 3){
       System.out.print("Enter the final amount value (y): ");
      finalAmountAN = input.nextDouble();

      System.out.print("Enter the initial amount (n): ");
      initialValueAN = input.nextInt();

      System.out.print("Enter the decay time (t): ");
      decayTimeAN = input.nextInt();

      System.out.println("Constant (half-life): " + ((Math.log(finalAmountAN / initialValueAN)) / decayTimeAN));
    }
  }
}