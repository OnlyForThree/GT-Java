/**
 * 
 * Designer: Alex Nguyen
 * Date: 7/6/22
 * Filename: TrigFunctions.java
 * Purpose:  a TrigFunctions application that:
-Prompts the user for an angle in degrees.
-Then displays the sine, cosine, and tangent of the angle. 
 */
import java.lang.Math;
import java.util.Scanner;
import java.text.NumberFormat;

class TrigFunctions {
  public static void main(String[] args) {
    int userAngleAN;
    double cosAN, sinAN, tanAN;
    
    Scanner input = new Scanner(System.in);
    NumberFormat decimal = NumberFormat.getNumberInstance();

    System.out.print("Enter an angle in degrees: ");
    userAngleAN = input.nextInt();

    sinAN = (Math.sin(Math.toRadians(userAngleAN)));
    cosAN = (Math.cos(Math.toRadians(userAngleAN)));
    tanAN = (Math.tan(Math.toRadians(userAngleAN)));

    System.out.println("Sine: " + decimal.format(sinAN));
    
    System.out.println("Cosine: " + decimal.format(cosAN));
    
    System.out.println("Tangent: " + decimal.format(tanAN));
    
  }
}