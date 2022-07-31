/**
 * 
 * Designer: Alex Nguyen
 * Date: 7/6/22
 * Filename: PackageCheck.java
 * Purpose:  A PackageCheck application that prompts the user for the weight of a package and its dimensions in centimeters (length, width, and height), and then displays an appropriate message if the package does not meet the requirements. 
 */

import java.util.Scanner;

public class PackageCheck{
  public static void main(String[] args){
    int weightAN, lengthAN, widthAN, heightAN, volumeAN;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter package weight in kilograms: ");
    weightAN = input.nextInt();

    System.out.print("Enter package length in centimeters: ");
    lengthAN = input.nextInt();

    System.out.print("Enter package width in centimeters: ");
    widthAN = input.nextInt();

    System.out.print("Enter package height in centimeters: ");
    heightAN = input.nextInt();

    volumeAN = (heightAN / 100) * (widthAN / 100) * (lengthAN / 100);

    if ((weightAN > 27) && (volumeAN > 0.1)){
      System.out.println("Too heavy and too large.");
    }
    else if ((weightAN > 27) && (volumeAN <= 0.1)){
      System.out.println("Too heavy.");
    }
    else if ((weightAN <= 27) && (volumeAN > 0.1)){
      System.out.println("Too large.");
    }
  }
}