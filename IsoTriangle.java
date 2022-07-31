/**
*Name: Alex Nguyen
*Date: 07/25/22
*Program Name: IsoTriangle.java
*Purpose: Prints a triangle with the corresponding height of the user's input
*/

import java.util.Scanner;

public class IsoTriangle{
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size: ");
    int numberAN = input.nextInt();      
    drawBar(numberAN);
        
  }

  public static void drawBar(int numberAN){

    System.out.println();
    
    for (int i = 1; i <= numberAN; i++) {

      addSpaces(numberAN, i);
      
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      if(i != 1){
        for (int j = 2; j <= i; j++){
          System.out.print("*");
        }
      }
      
      System.out.println();
    }
  }

  public static void addSpaces(int numberAN, int i){
      for (int j = numberAN; j >= i; j--) {
        System.out.print(" ");
      }
  }
  
}