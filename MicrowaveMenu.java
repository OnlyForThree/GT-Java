/**
Author: Sayo Odusote + Alex Nguyen
Date: 7/13/2022
Project Name: MicrowaveMenu.java
user inputs the cook time as digits then the application outputs it as a time
*/
// Sayo Odusote
import java.util.Scanner; // import Scanner
import java.lang.String; // import string class
class MicrowaveMenu {
  public static void main(String[] args) {
    System.out.println("Program java Microwave");
    // gets the digits from the user
    String digits;    
    int length = 0;
Scanner input = new Scanner(System.in);
  System.out.print("Enter cook time -> ");
     digits = input.next(); 
    // checks to see if the user inputted anything and if theu didn't the application would ask ffor the cook time again if not the application will continue
    for (int i = 0; i < 100; i++){
      if (digits.equals("0") || digits.equals(" ")){
        digits = " ";
        System.out.print("Enter cook time -> ");
     digits = input.next(); 
      } else { 
        break; 
      }
    }
    // finds the length the of the users word
        length = digits.length();
    // if the length of the digits is 1, 2, 3, or 4 then it'll set the digits to the time then print it out
     if (length == 1){
      String newOne = "00:0" + digits;
      digits = digits.replaceAll(digits, newOne);
      System.out.println("Your time -> " + digits);
    }
        // Alex Nguyen
    else if (length == 2){
      String newOne = "00:" + digits;
      digits = digits.replaceAll(digits, newOne);
      System.out.println("Your time -> " + digits);
    } 
    else if (length == 3){
      String partOne = digits.substring(0,1);
      String partTwo = digits.substring(1,3);
      digits = partOne + ":" + partTwo;
      System.out.println("Your time -> " + digits);
  }
     else if (length == 4){
      String partOne = digits.substring(0,2);
      String partTwo = digits.substring(2,4);
      digits = partOne + ":" + partTwo;
      System.out.println("Your time -> " + digits);
     }
  }
}