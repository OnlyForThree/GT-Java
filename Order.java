/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/29/22
 * Filename: Order.java
 * Purpose:  An Order application that prompts the employee for the number of burgers, fries and sodas and then displays the total.  The tax is 6.5% and the final cost will be displayed. The Order application will also prompt to the employee for the amount tendered and then display the change due.
 */

import java.util.Scanner; // Import the Scanner
import java.text.NumberFormat; // Import Number Format

public class Order{
  public static void main(String[] args){
    //Declare variables
    int burgersAN = 0;
    int friesAN = 0;
    int sodasAN = 0;
    double totalAN = 0;
    double tenderedAN = 0;
    
    Scanner input = new Scanner(System.in);
    NumberFormat money = NumberFormat.getCurrencyInstance();
    
    //Recieve inputs for variables
    System.out.print("Enter number of burgers ($3.69 each): ");
    burgersAN = input.nextInt();
    System.out.print("Enter number of fries ($3.09 each): ");
    friesAN = input.nextInt();
    System.out.print("Enter number of sodas ($1.99 each): ");
    sodasAN = input.nextInt();
    
    //Caluclate total
    totalAN = ((burgersAN * 3.69) + (friesAN * 3.09) + (sodasAN * 1.99)) * 1.065;
    
    //Display total
    System.out.println("The total is: " + money.format(totalAN));

    //Recieve input for variable
    System.out.print("\nEnter amount tendered: $");
    tenderedAN = input.nextDouble();

    //Display change
    System.out.println("Change: " + money.format(tenderedAN - totalAN));
  }
}  