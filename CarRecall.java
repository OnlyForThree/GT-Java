/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/30/22
 * Filename: CarRecall.java
 * Purpose:  A CarRecall application that prompts a customer for the model number of their car to find out if it is defective. Model number 179 also needs a special prompt to inform the user that their car is defective and they need a new bumper.
 */
import java.util.Scanner;

public class CarRecall{
  public static void main(String[] args){

    int userModelAN;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the car's model number: ");
    userModelAN = input.nextInt();

    if ((userModelAN == 119) || (userModelAN == 189))
      {
      System.out.println("Your car is defectove. It must be repaired.");
      }
    else if ((userModelAN == 190) || (userModelAN == 191))
    {
      System.out.println("Your car is defectove. It must be repaired.");
    }
    else if ((userModelAN == 192) || (userModelAN == 193))
      {
      System.out.println("Your car is defectove. It must be repaired.");
      }
      else if ((userModelAN == 194) || (userModelAN == 195))
      {
      System.out.println("Your car is defectove. It must be repaired.");
      }
    else if ((userModelAN == 221) || (userModelAN == 780))
      {
      System.out.println("Your car is defectove. It must be repaired.");
      }
    else if (userModelAN == 179)
    {
      System.out.println("Your car is defective. The bumper must be replaced.");
    }
    else
    {
      System.out.println("Your car is not defective.");
    }
  }
}