/**
*Name: Alex Nguyen
*Date: 07/21/22
*Program Name: MetricConversion.java
*Purpose: A calculator that converts imperial to metric and vice versa
*/
import java.util.Scanner;

public class MetricConversion{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int inputAN = input.nextInt();

    System.out.print("Convert:\n");
    System.out.format("%-30s %-25s", "1. Inches to Centimeters", "5. Centimeters to Inches\n");
    System.out.format("%-30s %-23s", "2. Feet to Centimeters", "6. Centimeters to Feet\n");
    System.out.format("%-30s %-19s", "3. Yards to Meters", "7. Meters to Yards\n");
    System.out.format("%-30s %-23s", "4. Miles to Kilometers", "8. Kilometers to Miles\n");
    
    System.out.print("\nEnter your choice: ");
    int choiceAN = input.nextInt();

    switch (choiceAN){
      case 1: inToCm(inputAN); break;
      case 2: ftToCm(inputAN); break;
      case 3: ydToM(inputAN); break;
      case 4: miToKm(inputAN); break;
      case 5: cmToIn(inputAN); break;
      case 6: cmToFt(inputAN); break;
      case 7: mToYd(inputAN); break;
      case 8: kmToMi(inputAN); break;
    }
  }

  public static void inToCm(int inputAN){
    System.out.println("\n" + inputAN + " inches equals " + (inputAN * 2.54) + " centimeters.");
  }

  public static void ftToCm(int inputAN){
    System.out.println("\n" + inputAN + " feet equals " + (inputAN * 30) + " centimeters.");
  }

  public static void ydToM(int inputAN){
    System.out.println("\n" + inputAN + " yards equals " + (inputAN * 0.91) + " meters.");
  }

  public static void miToKm(int inputAN){
    System.out.println("\n" + inputAN + " miles equals " + (inputAN * 1.6) + " kilometers.");
  }

  public static void cmToIn(int inputAN){
    System.out.println("\n" + inputAN + " centimeters equals " + (inputAN / 2.54) + " inches.");
  }

  public static void cmToFt(int inputAN){
    System.out.println("\n" + inputAN + " centimeters equals " + (inputAN / 30) + " feet.");
  }

  public static void mToYd(int inputAN){
    System.out.println("\n" + inputAN + " meters equals " + (inputAN / 0.91) + " yards.");
  }

  public static void kmToMi(int inputAN){
    System.out.println("\n" + inputAN + " kilometers equals " + (inputAN / 1.6) + " miles.");
  }
}