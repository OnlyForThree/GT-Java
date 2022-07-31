/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/28/22
 * Filename: GallonConverter.java
 * Purpose: A GallonConverter application that prompts the user for the number of gallons and then displays the number of quarts, pints, cups, and tablespoons in that number of gallons.
 */

import java.util.Scanner; // Import the Scanner

public class GallonConverter{
  public static void main(String[] args){
    //Declare variable
    double gallonsAN = 0;
    double quartsAN = 0;
    double pintsAN = 0;
    double cupsAN = 0;
    double tablespoonsAN = 0;
    
    Scanner input = new Scanner(System.in);
    
    //Total all steps
    System.out.print("Enter number of gallons: ");
    gallonsAN = input.nextDouble();

    //Caluclate other total + averages
    quartsAN = gallonsAN * 4;
    pintsAN = quartsAN * 2;
    cupsAN = pintsAN * 2;
    tablespoonsAN = cupsAN * 16;
    
    //Display total + averages
    System.out.println("In " + gallonsAN + " gallons there are:");
    System.out.println(quartsAN + " quarts");
    System.out.println(pintsAN + " pints");
    System.out.println(cupsAN + " cups");
    System.out.println(tablespoonsAN + " tablespoons");
  }
}