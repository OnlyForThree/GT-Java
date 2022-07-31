/**
 * 
 * Designer: Alex Nguyen
 * Date: 7/5/22
 * Filename: Volumes.java
 * Purpose:  A Volumes application that displays volume of the chosen object and input.
 */

import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;
public class Volumes{
  public static void main(String[] args){
    int userChoiceAN;
    double volumeAN;
    double lengthAN, widthAN, heightAN;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the shape you would like to find the volume for [1-Rectangular Prism] [2-Sphere] [3-Cube] ");
    userChoiceAN = input.nextInt();
      
    if (userChoiceAN == 1){
      System.out.println("Rectangular Prism");
          
          System.out.print("Enter the length: ");
          lengthAN = input.nextDouble();
          
          System.out.print("Enter the width: ");
          widthAN = input.nextDouble();
          
          System.out.print("Enter the height: ");
          heightAN = input.nextDouble();

          volumeAN = heightAN * widthAN * lengthAN;
          System.out.print("The volume is: ");
          System.out.format("%.2f", volumeAN);
    }
    if (userChoiceAN == 2){
      System.out.println("Sphere");
          
          System.out.print("Enter the radius: ");
          lengthAN = input.nextDouble();

          volumeAN = Math.pow((lengthAN *2), 3) * Math.PI / 6;
      
          System.out.print("The volume is: ");
          System.out.format("%.2f", volumeAN);
    }
      if (userChoiceAN == 3){
      System.out.println("Cube");
          
          System.out.print("Enter the length of each side: ");
          lengthAN = input.nextDouble();

          volumeAN = Math.pow(lengthAN, 3);
      
          System.out.print("The volume is: ");
          System.out.format("%.2f", volumeAN);
      }
    }
  }
