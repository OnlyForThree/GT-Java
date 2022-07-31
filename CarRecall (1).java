/**
 * 
 * Designer: Alex Nguyen
 * Date: 07/12/22
 * Filename: CarRecall.java
 * Purpose:  A CarRecall application that prompts a customer for the model number of their car to find out if it is defective. Model number 179 also needs a special prompt to inform the user that their car is defective and they need a new bumper.
 */
import java.util.Scanner; //Import scanner

public class CarRecall{
  public static void main(String[] args){
    //Declare variable
    int userModelAN = 1;
    final int SENTINEL = 0;


    Scanner input = new Scanner(System.in);

    while (userModelAN != SENTINEL) {
    //Collect user car model number
    System.out.print("Enter the car's model number or 0 to quit: ");
    userModelAN = input.nextInt();

    switch (userModelAN){
      case 0: break;
      case 119:
      case 189:
      case 190:
      case 191:
      case 192:
      case 193:
      case 194:
      case 195:
      case 221:
      case 780: System.out.println("Your car is defectove. It must be repaired."); break;
      case 179: System.out.println("Your car is defective. The bumper must be replaced."); break;
      default: System.out.println("Your car is not defective.");
      
    }
    }
  }
}